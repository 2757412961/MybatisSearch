package cn.edu.zju.gislab.SCSServices.dao;

import cn.edu.zju.gislab.SCSServices.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    User getUserByID(int id);

    // 缓存
    User getUserByCache(int id);

    // 注解
    @Select("SELECT * FROM user WHERE name=#{name}")
    List<User> getUsersByName(String name);

    // 模糊查询
    List<User> getUserLike(Map<String, Object> map);

    List<User> getFieldByMap(Map<String, Object> map);

    // 分页
    List<User> getUserByLimit(@Param("startIndex") int startIndex, @Param("num") int num);

    int addUser(User user);

    @Insert("INSERT INTO user(name, pwd) VALUES(#{name}, #{password})")
    int addUserByA(@Param("name") String name, @Param("password") String password);

    // map 作为参数
    int addUserByMap(Map<String, Object> map);

    int updateUser(User user);

    @Update("UPDATE user SET name=#{name}, pwd=#{password} WHERE id=#{id}")
    int updateUserByA(User user);

    int deleteUserByID(int id);

}
