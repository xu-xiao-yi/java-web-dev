package com.web;

import com.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author mqxu
 * @date 2019.9.17
 * 登陆的请求响应
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求乱码
//        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取前台表单的用户名参数
        String username = req.getParameter("username");
        //取得密码参数
//        String password = req.getParameter("password");
        System.out.println(username);

        //创建LoginService类的对象
//        LoginService loginService = new LoginService();
//        //调用登陆功能，得到布尔值
//        boolean flag = loginService.isLogin(username, password);
//        //登陆成功
//        if (flag) {
//            //通过request对象获取session会话对象
//            HttpSession session = req.getSession();
//            //取得sessionId，和对应的客户端的cookie的sessionId一样
//            String sessionId = session.getId();
//            System.out.println("sessionId:" + sessionId);
//            //把用户名存入session对象
//            session.setAttribute("username", username);
//            session.setAttribute("password", password);
//            //进行重定向跳转（客户端跳转）
//          //  resp.sendRedirect("/index.jsp");
//        } else {
        //通过response响应对象获得向客户端的输出流，此处用的PrintWriter字符流
        //  PrintWriter out = resp.getWriter();
        //向客户端输出登陆失败的信息（js脚本的方式）
        //  out.println("<script>alert('login failure')</script>");
        //重定向到登陆页面
        //  resp.sendRedirect("/");
//    }
    }
}
