package com.myform;

import java.io.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Servlet implementation class databaseProg
 */
@WebServlet("/databaseProg")
public class databaseProg extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public databaseProg() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String Name = request.getParameter("name");
		String col = request.getParameter("col");
		String dept = request.getParameter("dep");
		String course = request.getParameter("course");
		String sem = request.getParameter("sem");
		String cgpa = request.getParameter("cgpa");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String fileName = "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\My_form\\\\src\\\\com\\\\myform\\\\my_database.txt";
		String str = Name+"\t\t"+col+"\t"+dept+"\t"+course+"\t"+sem+"\t"+cgpa+"\t"+email+"\t"+phno+"\n";
		try { 
			  
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true)); 
            out.write(str); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
		RequestDispatcher ds = request.getRequestDispatcher("fill_up_form.html");
		ds.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
