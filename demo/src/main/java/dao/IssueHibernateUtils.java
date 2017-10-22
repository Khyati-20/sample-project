package dao;

import java.util.List;
import org.hibernate.*;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.IssuedDetails;
import pojo.Student;

public class IssueHibernateUtils {

	public static void save() {
		
		
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
	
		//Retrive.retrive(args);
		session.getTransaction().commit();
	
		
	}
	
	
	
	public static SessionFactory getSessionFactory()
	{
		return (new Configuration().addAnnotatedClass(Student.class)
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
			

	

		public static List<IssuedDetails> getDetails()
			{

				Session session = getSessionFactory().getCurrentSession();
				session.beginTransaction();
				List<IssuedDetails> list=session.createCriteria(IssuedDetails.class).list();
				//Retrive.retrive(args);
				session.getTransaction().commit();
				return list;
			} 

	
	
		
		
	

}
