package cn.edu.zju.gislab.SCSServices.dao;

import cn.edu.zju.gislab.SCSServices.po.User;
import cn.edu.zju.gislab.SCSServices.po.UserResultMap;

import java.util.List;
import java.util.Map;

public interface UserResultMapMapper {

    List<UserResultMap> getUserList();

    User getUserByID(int id);

    List<User> getUserLike(Map<String, Object> map);

    List<User> getFieldByMap(Map<String, Object> map);

    int addUser(User user);

    int addUserByMap(Map<String, Object> map);

    int updateUser(User user);

    int deleteUserByID(int id);

}
