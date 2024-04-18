/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.api_gateway.Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 *
 * @author Usuario
 */
public class CustomAthorizationFilter extends OncePerRequestFilter{

    public CustomAthorizationFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("METODO DE AUTENTICACION : " + request.getMethod());
        System.out.println("ENCABEZADO DE AUTORIZACION :  : " + request);
        System.out.println("URL :  : " + request.getRequestURI());
        
        response.setStatus(HttpStatus.OK.value());
            response.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, OPTIONS, PUT");
            response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type,X-Requested-With");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            
            filterChain.doFilter(request, response);
    }
    
}
