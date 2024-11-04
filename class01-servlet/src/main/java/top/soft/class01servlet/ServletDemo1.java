package top.soft.class01servlet;

import jakarta.servlet.*;

import java.io.IOException;

<<<<<<< HEAD
public class ServletDemo1  implements Servlet {
=======
public class ServletDemo1 implements Servlet {
>>>>>>> 5fc8e111e1f261b8eb329b54caf2c6a8804023a8
    /**
     * Servlet 初始化
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
<<<<<<< HEAD
        System.out.println("ServletDemo1 初始化");
    }

    /**
     * 获取Servlet配置
=======
        System.out.println("Servlet 初始化");

    }

    /**
     *获取Servlet配置
>>>>>>> 5fc8e111e1f261b8eb329b54caf2c6a8804023a8
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
<<<<<<< HEAD
     * 执行 Service 方法
     *
=======
     * 执行Servlet方法
>>>>>>> 5fc8e111e1f261b8eb329b54caf2c6a8804023a8
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
<<<<<<< HEAD
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        servletResponse.getWriter().write("servletDemo1 执行");

        System.out.println("service 执行");
    }

    /**
     * 获取 serlvet 信息
     *
     * @return
     */
=======

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletDemo1 执行");
        System.out.println("Servlet 执行");
    }

    /**
     * 获取Servlet方法
     * @return
     */

>>>>>>> 5fc8e111e1f261b8eb329b54caf2c6a8804023a8
    @Override
    public String getServletInfo() {
        return "";
    }

    /**
<<<<<<< HEAD
     * 销毁
     *
     */
    @Override
    public void destroy() {
        System.out.println("执行销毁");

    }
}
=======
     * 执行销毁方法
     */
    @Override
    public void destroy() {
        System.out.println("执行销毁方法");
    }
}
>>>>>>> 5fc8e111e1f261b8eb329b54caf2c6a8804023a8
