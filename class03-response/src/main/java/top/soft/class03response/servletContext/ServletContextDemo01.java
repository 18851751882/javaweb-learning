package top.soft.class03response.servletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author hcx
 * @description: TODO
 * @date 2024/9/28 16:36
 */

@WebServlet("/servleyContextDemo01")
public class ServletContextDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        通过request对象获取
        ServletContext servletContext01 = req.getServletContext();
//        通过 this 获取servletContext对象
        ServletContext servletContext02 = this.getServletContext();

        System.out.println(servletContext01.equals(servletContext02));
    }
}