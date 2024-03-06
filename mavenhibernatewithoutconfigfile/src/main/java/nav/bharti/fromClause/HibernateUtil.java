package nav.bharti.fromClause;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	static SessionFactory factory = null;
	public static SessionFactory getSessionFactory() {
		try {
			Configuration config = new Configuration();
			
			Properties propertiesSetting = new Properties();
	        propertiesSetting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	        propertiesSetting.put(Environment.URL, "jdbc:mysql://localhost:3306/amity");
	        propertiesSetting.put(Environment.USER, "root");
	        propertiesSetting.put(Environment.PASS, "navbharti");
	        propertiesSetting.put(Environment.SHOW_SQL, true);
	        propertiesSetting.put(Environment.HBM2DDL_AUTO, "update");
	        propertiesSetting.put(Environment.FORMAT_SQL, true);
			
	        config.setProperties(propertiesSetting);
			config.addAnnotatedClass(Student.class);
			
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
