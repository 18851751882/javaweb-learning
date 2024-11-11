package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
@WebServlet("/RequestDemo02")
public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.遍历所有请求头数据
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String Name = headerNames.nextElement();
            //根据名称获取请求头的值
            String header = req.getHeader(Name);
            System.out.println(Name+":"+header);
        }
        //2.根据名称获取请求头的值
        String header = req.getHeader("user-agent");
        if (header.contains("Edge")) {
            System.out.println("Edge浏览器");
        } else {
            System.out.println("Chrome浏览器");
        }
    }
}
