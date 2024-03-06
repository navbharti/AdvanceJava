package nav.bharti;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	
	private static SessionFactory factory=null;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration config = new Configuration();
		
		Properties properties = new Properties();
		
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hospital");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "navbharti");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.FORMAT_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		
		config.setProperties(properties);
		config.addAnnotatedClass(Student.class);
		
		factory = config.buildSessionFactory();
		
		
		
		
		
		return factory;
	}

}
