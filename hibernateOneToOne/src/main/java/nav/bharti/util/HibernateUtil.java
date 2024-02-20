package nav.bharti.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import nav.bharti.entities.Department;
import nav.bharti.entities.Faculty;

public class HibernateUtil {
	static SessionFactory factory = null;
	public static SessionFactory getSessionFactory() {
		try {
			Configuration config = new Configuration();

			Properties hibernateProperties = new Properties();
			
			hibernateProperties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			hibernateProperties.put(Environment.URL, "jdbc:mysql://localhost:3306/hospital?useSSL=false");
			hibernateProperties.put(Environment.USER, "root");
			hibernateProperties.put(Environment.PASS, "navbharti");
			//hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			hibernateProperties.put(Environment.HBM2DDL_AUTO, "create-drop");
			hibernateProperties.put(Environment.SHOW_SQL, "true");
			hibernateProperties.put(Environment.FORMAT_SQL, "true");
			
			config.setProperties(hibernateProperties);
			
			config.addAnnotatedClass(Faculty.class);
			config.addAnnotatedClass(Department.class);
			
			factory = config.buildSessionFactory();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public static void closeFactory() {
		if(factory != null)
			factory.close();
	}
}
