package dao;

import java.util.List;
import org.hibernate.*;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Student;


public class StdHibernateUtils {

		
		public static Student save(Student std) {
			
			
			Session session = getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(std);
			//Retrive.retrive(args);
			session.getTransaction().commit();
			return std; 
			
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
				

		

			public static List<Student> getStudent()
				{

					Session session = getSessionFactory().getCurrentSession();
					session.beginTransaction();
					List<Student> list=session.createCriteria(Student.class).list();
					//Retrive.retrive(args);
					session.getTransaction().commit();
					return list;
				} 

		
			public static Student getStudent(String Id)
			{

				Session session = getSessionFactory().getCurrentSession();
				session.beginTransaction();
				
				Student std= session.get(Student.class,Id );
				//Retrive.retrive(args);
				session.getTransaction().commit();
				return std;
			
			} 
			
			public static void DeleteStudent(Student std) {
				Session session = getSessionFactory().getCurrentSession();
				session.beginTransaction();
				
				session.delete(std);
				
				
				
			}
			
			
		
		}
		


