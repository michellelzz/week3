package com.Wanyu.controller;

import com.Wanyu.dao.ProductDao;
import com.Wanyu.model.Category;
import com.Wanyu.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShopServlet", value = "/ShopServlet")
public class ShopServlet extends HttpServlet {
    Connection con = null;
    @Override
    public  void init() throws ServletException{
        super.init();
        con=(Connection) getServletContext().getAttribute("con");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Category category=new Category();
        List<Category> categoryList = category.findAllCategory(con);
        request.setAttribute("categoryList", categoryList);

        ProductDao productDao=new ProductDao();
        List<Product> productList=null;
        try{
        if(request.getParameter("categoryId")==null)
            {
            productList = productDao.findAll(con);
            }else
            {
                int categoryId=Integer.parseInt(request.getParameter("category"));
                productList=productDao.findByCategoryId(categoryId,con);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        request.setAttribute("productList",productList);
        String path="/WEB-INF/views/shop.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
