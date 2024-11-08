package top.soft.class03response.response;
import  jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Lenovo
 * @description: TODO
 * @date 2024/9/28 14:54
 */

@WebServlet("/res")
public class ResponseTypeDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        switch (type){
            case "img":
                getImage(req,resp);
                break;
        }
    }
    private void getImage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/jpeg");
        String realPath = req.getServletContext().getRealPath("/image/image.jpg");
        File file = new File(realPath);
        InputStream in=new FileInputStream(file);
        int read=0;
        ServletOutputStream out = resp.getOutputStream();
        while ((read=in.read())!=-1){
            out.write(read);
        }
        out.flush();
        out.close();
    }
}
