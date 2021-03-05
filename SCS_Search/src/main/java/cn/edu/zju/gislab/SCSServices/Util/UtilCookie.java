package cn.edu.zju.gislab.SCSServices.Util;

import javax.servlet.http.Cookie;

public class UtilCookie {
    public static Cookie createCookie(String key, String value, int maxAge, String path, Boolean httpOnly) {
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(maxAge);
        cookie.setPath(path);
        cookie.setHttpOnly(httpOnly);

        return cookie;
    }

    public static Cookie createCookie(String key, String value, int maxAge, String path) {
        return createCookie(key, value, maxAge, path, false);
    }


    public static Cookie createCookie(String key, String value, int maxAge) {
        return createCookie(key, value, maxAge, "/");
    }


    public static Cookie createCookie(String key, String value) {
        return createCookie(key, value, 6 * 60 * 60);
    }

    public static Cookie getCookie(Cookie[] cookies, String name) {
        if (cookies == null || cookies.length == 0) return null;

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) {
                return cookie;
            }
        }

        return null;
    }

    public static Boolean delCookie(Cookie cookie) {
        if (cookie != null) {
            cookie.setValue(null);
            cookie.setMaxAge(0);
            cookie.setPath("/");
            return true;
        }

        return false;
    }

}
