package com.workpro.test;

import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行doGet方法");
        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行doPost方法");
        System.out.println("随便输出点什么");
        System.out.println("在进行一些修改");
        System.out.println("在进行一些修改");
        System.out.println("对代码进行修改");
        doGet(req, resp);
    }

}
