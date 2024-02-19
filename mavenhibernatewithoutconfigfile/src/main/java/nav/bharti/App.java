package nav.bharti;

import java.util.List;
import java.util.Properties;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config = new Configuration();
        
        Properties propertiesSetting = new Properties();
        propertiesSetting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        propertiesSetting.put(Environment.URL, "jdbc:mysql://localhost:3306/hospital");
        propertiesSetting.put(Environment.USER, "root");
        propertiesSetting.put(Environment.PASS, "navbharti");
        propertiesSetting.put(Environment.SHOW_SQL, true);
        propertiesSetting.put(Environment.HBM2DDL_AUTO, "update");
        //propertiesSetting.put(Environment.RESOURCES_CLASSLOADER, "nav.bharti.Student");
        config.addClass(Student.class);
        
        config.setProperties(propertiesSetting);
        
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("from Student");
        List <Student> students = query.list();
        for(Student s : students) {
        	System.out.println(s);
        }
        
        tx.commit();
        
        session.close();
        
        factory.close();
        
    }
}
