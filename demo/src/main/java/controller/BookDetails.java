package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookHibernateUtils;
import pojo.Book;


/**
 * Servlet implementation class BookDetails
 */
public class BookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BookHibernateUtils utils=new BookHibernateUtils();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Book b=new Book();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String bookName=request.getParameter("bname");
		String bookId=request.getParameter("bid");
		String max=request.getParameter("max");
		String bookAuthor=request.getParameter("bauthor");
		String available=request.getParameter("available");
			
		b.setBookAuthor(bookAuthor);
		b.setBookId(bookId);
		b.setBookName(bookName);
		b.setAvailable(available);
		b.setMax(max);
	
		
		
		utils.save(b);
		
	
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
