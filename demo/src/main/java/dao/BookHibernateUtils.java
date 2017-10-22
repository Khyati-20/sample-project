package dao;

import java.util.List;
import org.hibernate.*;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Book;


public class BookHibernateUtils {

	public static Book save(Book book) {
		
		
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(book);
		//Retrive.retrive(args);
		session.getTransaction().commit();
		return book; 
		
	}
	
	
	
	public static SessionFactory getSessionFactory()
	{
		return (new Configuration().addAnnotatedClass(Book.class)
				.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver")
				.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect")
				.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/test")
				.setProperty("hibernate.hbm2ddl.auto","update")
				.setProperty("hibernate.connection.username","root")
				.setProperty("hibernate.connection.password","root")
				.setProperty("hibernate.current_session_context_class","thread")
				.setProperty("hibernate.show_sql","true")
				.buildSessionFactory()); 
	}
			

	

		public static List<Book> getBook()
			{

				Session session = getSessionFactory().getCurrentSession();
				session.beginTransaction();
				List<Book> list=session.createCriteria(Book.class).list();
				//Retrive.retrive(args);
				session.getTransaction().commit();
				return list;
			} 

	
		public static Book getBook(String Id)
		{

			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			
			Book book= session.get(Book.class,Id );
			//Retrive.retrive(args);
			session.getTransaction().commit();
			return book;
		
		} 
		
		public static void DeleteBook(Book book) {
			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			
			session.delete(book);
			
			
			
		}
		
		
	

	
}
