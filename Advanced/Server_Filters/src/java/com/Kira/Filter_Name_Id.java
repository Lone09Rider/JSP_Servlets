/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package com.Kira;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author KirA
 */
@WebFilter(filterName = "IdFilter", urlPatterns = {"/add"})
public class Filter_Name_Id implements Filter {
    

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        PrintWriter out = response.getWriter();
        
        HttpServletRequest req = (HttpServletRequest) request;
        String aname = req.getParameter("aname");
        int aid = Integer.parseInt(req.getParameter("aid"));
        
        if (aid > 0 && aname.length() > 3) {
            chain.doFilter(request, response);
        }    
        
        else {
            out.println("Invalid Input");
        }
    }

    @Override
    public void destroy() {
        
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {        

    }

}
