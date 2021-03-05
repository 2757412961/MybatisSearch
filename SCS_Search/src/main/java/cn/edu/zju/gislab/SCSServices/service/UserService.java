package cn.edu.zju.gislab.SCSServices.service;


import cn.edu.zju.gislab.SCSServices.po.ScsUsers;

import java.util.List;
import java.util.Map;

public interface UserService {
    // 登录验证
    int checkLogin(String username, String password);

    // 注册
    String signUp(Map<String, String[]> parameterMap);

    List<ScsUsers> getAllUsers();

    int updateUser(String username, String password, int grants);

    int addUser(String username, String password, int grants);

    int deleteUser(String username);
}
