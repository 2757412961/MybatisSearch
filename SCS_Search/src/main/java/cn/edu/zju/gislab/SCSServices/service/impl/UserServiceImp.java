package cn.edu.zju.gislab.SCSServices.service.impl;


import cn.edu.zju.gislab.SCSServices.mapper.ScsUsersMapper;
import cn.edu.zju.gislab.SCSServices.po.ScsUsers;
import cn.edu.zju.gislab.SCSServices.po.ScsUsersExample;
import cn.edu.zju.gislab.SCSServices.service.UserService;
import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImp implements UserService {

    @Autowired
    private ScsUsersMapper usersMapper;

    public String encode2SHA256(String str) {
        MessageDigest messageDigest = null;
        String encodeStr = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encodeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return encodeStr;
    }

    public ScsUsers searchUser(String username) {
        // 查询数据库
        ScsUsersExample usersExample = new ScsUsersExample();
        // 通过criteria构造查询条件
        ScsUsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<ScsUsers> userList = usersMapper.selectByExampleWithBLOBs(usersExample);

        if (userList.remove(null) || userList.isEmpty()) {
            return null;
        } else {
            ScsUsers scsUsers = userList.get(0);
            return scsUsers;
        }
    }

    /**
     * 返回 -1 0 1，异常 普通用户 管理员
     *
     * @param username
     * @param shaPassword
     * @return
     */
    @Override
    public int checkLogin(String username, String shaPassword) {
        int resultGrants = -1;

        ScsUsers scsUsers = searchUser(username);
        if (scsUsers == null) return resultGrants;

        // 检查 SHA256 加密密码是否正确
        String encodePassword = encode2SHA256(scsUsers.getPassword());
        if (encodePassword != null && encodePassword.equals(shaPassword)) {
            resultGrants = scsUsers.getGrants();
        }

        return resultGrants;
    }

    @Override
    public String signUp(Map<String, String[]> parameterMap) {
        String username = parameterMap.getOrDefault("username", new String[]{"username"})[0];
        String password = parameterMap.getOrDefault("password", new String[]{"password"})[0];
        int group = Integer.parseInt(parameterMap.getOrDefault("group", new String[]{"0"})[0]);
        int grant = Integer.parseInt(parameterMap.getOrDefault("grant", new String[]{"0"})[0]);

        // 如果已存在用户名，返回
        ScsUsers scsUsersExits = searchUser(username);
        if (scsUsersExits != null) return null;

        ScsUsers scsUsers = new ScsUsers();
        scsUsers.setUsername(username);
        scsUsers.setPassword(password);
        scsUsers.setGrants(grant);
        scsUsers.setGroupId(group);
        if (usersMapper.insertSelective(scsUsers) == 1) {
            return username;
        }

        return null;
    }

    @Override
    public List<ScsUsers> getAllUsers() {
        ScsUsersExample usersExample = new ScsUsersExample();
        List<ScsUsers> userList = usersMapper.selectByExampleWithBLOBs(usersExample);
        return userList;
    }

    @Override
    public int updateUser(String username, String password, int grants) {
        ScsUsers user = new ScsUsers();
        user.setUsername(username);
        user.setPassword(password);
        user.setGrants(grants);
//        user.setGroupId(groupId);
        usersMapper.updateByPrimaryKeyWithBLOBs(user);

        return 1;
    }

    @Override
    public int addUser(String username, String password, int grants) {
        ScsUsersExample usersExample = new ScsUsersExample();
        // 通过criteria构造查询条件
        ScsUsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<ScsUsers> userList = usersMapper.selectByExample(usersExample);
        if (userList != null && userList.size() > 0) {
            return 0;
        } else {
            ScsUsers user = new ScsUsers();
            user.setUsername(username);
            user.setPassword(password);
            user.setGrants(grants);
            user.setGroupId(0);
            usersMapper.insert(user);
            return 1;
        }
    }

    @Override
    public int deleteUser(String username) {
        usersMapper.deleteByPrimaryKey(username);
        return 1;
    }

}
