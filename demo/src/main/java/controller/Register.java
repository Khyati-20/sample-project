package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StdHibernateUtils;
import pojo.Student;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StdHibernateUtils utils=new StdHibernateUtils();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student std=new Student();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String studentName=request.getParameter("stdname");
		String studentId=request.getParameter("stdid");
		String studentClass=request.getParameter("stdclass");
		String studentEmail=request.getParameter("stdemail");
		String penalty=request.getParameter("penalty");
		String status=request.getParameter("status");
		String count=request.getParameter("bcount");
		
		
	
		std.setStudentClass(studentClass);
		std.setStudentEmail(studentEmail);
		std.setStudentId(studentId);
		std.setStudentName(studentName);
		std.setPenalty(penalty);
		std.setStatus(status);
		std.setCount(count);
		
		
		
		utils.save(std);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
