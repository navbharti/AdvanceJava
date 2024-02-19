package nav.bharti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import nav.bharti.entities.Address;
import nav.bharti.entities.Name;
import nav.bharti.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
        config.configure();
        
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Name name = new Name();
        
        name.setFirstName("Rakesh");
        name.setMiddleName("Kumar");
        name.setLastName("Dubey");
        
        Address address = new Address();
        address.setHouseNo("#32");
        address.setStreet("DPS More");
        address.setCity("Patna");
        address.setState("Bihar");
        address.setCountry("India");
        
        Student st = new Student();
        
        st.setId(111);
        st.setName(name);
        
        st.setAddress(address);
        st.setAge(22);
        st.setMarks(78.9);
        st.setGender("male");
        
        session.save(st);
        
        tx.commit();
        session.close();    }
}
