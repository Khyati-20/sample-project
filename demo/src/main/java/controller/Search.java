package controller;

import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import antlr.Utils;
import pojo.*;
import dao.BookHibernateUtils;
import dao.StdHibernateUtils;



/**
 * Servlet implementation class Search
 */
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BookHibernateUtils utils=new BookHibernateUtils();
       StdHibernateUtils sutils=new StdHibernateUtils();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);  
		
		
		PrintWriter out=response.getWriter();
		String Id=request.getParameter("sid");
		Student emp=sutils.getStudent(Id);
		out.println( "\n"+"Student Name = " +" "+emp.getStudentName()+ "\n");
		out.println("Student Id = " +" "+emp.getStudentId()+ "\n");
		out.println("Student email = " +" "+emp.getStudentEmail()+ "\n");
		out.println("Student class  = " +" "+emp.getStudentClass() + "\n");
		out.println("Student penalty = " +" "+emp.getPenalty()+ "\n");
		out.println("Student status = " +" "+emp.getStatus()+ "\n");
		out.println("Student count = " +" "+emp.getCount()+ "\n");
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);  
		
		
		PrintWriter out=response.getWriter();
		String Id=request.getParameter("bid");
		pojo.Book book=utils.getBook(Id);
		out.println( "\n"+"book Name = " +" "+book.getBookName()+ "\n");
		out.println("book Id = " +" "+book.getBookId()+ "\n");
		out.println("book author = " +" "+book.getBookAuthor()+ "\n");
		out.println("max book= " +" "+book.getMax()+ "\n");
		out.println("available book  = " +" "+book.getAvailable()+ "\n");
		
		
	//	doGet(request, response);
	}

}
