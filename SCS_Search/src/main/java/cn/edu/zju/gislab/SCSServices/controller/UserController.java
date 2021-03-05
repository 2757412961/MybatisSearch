package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.Constant.ConstantCookie;
import cn.edu.zju.gislab.SCSServices.Util.UtilCookie;
import cn.edu.zju.gislab.SCSServices.po.ScsUsers;
import cn.edu.zju.gislab.SCSServices.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.*;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    // 是否登录
    @GetMapping("/isLogin")
    public Boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = UtilCookie.getCookie(request.getCookies(), ConstantCookie.USERNAME);
        if (cookie != null && !cookie.getValue().equals("")) {
            return true;
        }

        return false;
    }

    // 登录验证
    @RequestMapping("/login")
    public int login(String username, String password,
                     HttpSession session,
                     HttpServletRequest request, HttpServletResponse response) {
        // 登录验证
        int loginResult = userService.checkLogin(username, password);

        if (loginResult != -1) {
            Cookie cookie = UtilCookie.createCookie(ConstantCookie.USERNAME, username);
            response.addCookie(cookie);
        }

        // 返回用户权限
        return loginResult;
    }

    @RequestMapping("/logout")
    public Boolean logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = UtilCookie.getCookie(request.getCookies(), ConstantCookie.USERNAME);

        if (UtilCookie.delCookie(cookie)) {
            response.addCookie(cookie);
            return true;
        }

        return false;
    }

    @PostMapping("/signup")
    public Boolean signUp(@RequestBody HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String username = userService.signUp(parameterMap);
        if (username != null) {
            Cookie cookie = UtilCookie.createCookie(ConstantCookie.USERNAME, username);
            response.addCookie(cookie);
            return true;
        }

        return false;
    }

    // 查询所有用户
    @RequestMapping("/AllUsers")
    public List<ScsUsers> queryAllUser() {
        List<ScsUsers> result = userService.getAllUsers();
        return result;
    }

    @RequestMapping("/updateUser")
    public int updateUser(String username, String password, int grants) {
        int result = userService.updateUser(username, password, grants);
        return result;
    }

    @RequestMapping("/deleteUser")
    public int deleteUser(String username) {
        int result = userService.deleteUser(username);
        return result;
    }

    @RequestMapping("/addUser")
    public int addUser(String username, String password, int grants) {
        int result = userService.addUser(username, password, grants);
        return result;
    }

    // 曲终人散
    @RequestMapping("/userLogin")
    public Cookie[] userLogin(String username, String password,
                              HttpSession session,
                              HttpServletRequest request, HttpServletResponse response) {

//        session.setAttribute("username", username);
//        session.setAttribute("password", password);

        logger.info("Hello world!");
        // 默认情况下debug不会显示
        logger.info("info日志");
        logger.debug("debug日志");
        logger.error("error日志");
        logger.warn("warn日志");

        Cookie[] cookies = request.getCookies();

        return cookies;
    }

}
