package com.bjpowernode;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudetnController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

          if ("/springPlay/student/add".equals(req.getRequestURI())){
              add(req,resp);
          }else if("/springPlay/student/delete".equals(req.getRequestURI())){
              delete(req,resp);
          }else if ("/springPlay/student/modify".equals(req.getRequestURI())){
              modify(req,resp);
          }else{
              System.out.println("地址有误");
          }
    }

     public void add(HttpServletRequest req, HttpServletResponse resp){
         System.out.println("添加数据成功");
     }

    public void delete(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("删除数据成功");
    }

    public void modify(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("修改数据成功");
    }
}
