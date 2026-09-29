package com.campus.controller;
 import jakarta.servlet.annotation.WebServlet;
 import jakarta.servlet.http.HttpServlet;
 import jakarta.servlet.http.HttpServletRequest;
 import jakarta.servlet.http.HttpServletResponse;
 import java.io.IOException;
 import java.io.PrintWriter;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    private final StudentService studentService = new StudentService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Student List</h1>");
        out.println("<ul>");
        
        out.println(x: "<h1> All Students </h1>");
        out.println(x: "<ul>");
        for (Student student : studentService.getAllStudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println(x: "</ul>");    
    }
