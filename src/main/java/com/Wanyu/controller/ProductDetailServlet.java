package com.Wanyu.controller;

import com.Wanyu.dao.IProductDao;
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

@WebServlet(name = "ProductDetailServlet", value = "/productDetails")
public class ProductDetailServlet extends HttpServlet {
    Connection com=null;
    @Override
    public  void  init() throws  ServletException {
        super.init();
        Connection con = (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection con = null;
        List<Category> categoryList=Category.findAllCategory(con);
        request.setAttribute("productList",categoryList);
        try{
            if(request.getParameter("id")==null)
            {
                int productId=Integer.parseInt(request.getParameter("id"));
                IProductDao productDao=new ProductDao();
                Product product = productDao.findById(productId,con);
                request.setAttribute("p",product);

            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        String path="/WEB-INF/views/admin/productDetail.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
