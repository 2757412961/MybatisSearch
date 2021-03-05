package cn.edu.zju.gislab.SCSServices.Config;

import cn.edu.zju.gislab.SCSServices.Constant.ConstantCookie;
import cn.edu.zju.gislab.SCSServices.Util.UtilCookie;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "LoginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        // 用于用户登录验证
        String uri = req.getRequestURI();
        boolean isLoginReq =
                uri.matches("/SCSServices/login.action") ||
                uri.matches("/SCSServices/signup.action");

        Cookie cookie = UtilCookie.getCookie(req.getCookies(), ConstantCookie.USERNAME);
        if (!isLoginReq && (cookie == null || cookie.getValue().equals(""))) {
            return;
        }

        chain.doFilter(request, response);
    }
}