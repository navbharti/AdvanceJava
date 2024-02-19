package nav.bharti.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
        
        ///hibernateDemoProject/src/main/java/nav/bharti/hibernate/Student.hbm.xml
        //config.configure("/hibernateDemoProject/src/main/java/hibernate.cfg.xml");
        config.configure();
        
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        
        Transaction tx = session.beginTransaction();
        
       /* Student s = new Student();
        s.setId(22023);
        s.setName("Rakhi");
        s.setAge(21);
        s.setGender("female");
        s.setMarks(88.9);
        
        session.save(s); */
        
        //session.save(s);
     /*   Student st = session.get(Student.class, 996);
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getMarks());
        System.out.println(st.getGender());
        
        */
        //System.out.println(st); 
        
       // Student st = new Student("Ruby", 20, 86.8, "female");
        //session.saveOrUpdate(st);
//        st.setName("Mahak");
//        st.setAge(21);
        
    /*    Student st = session.get(Student.class, 996);
        st.setName("Ruby");
        session.saveOrUpdate(st);
        
        */
        
        Query query = session.createQuery("from Student");
        List <Student> students = query.list();
        //students.forEach(s->System.out.println(s));
        for(Student s : students) {
        	System.out.println(s);
        }
        
     // Delete a persistent object
//        Student student = session.get(Student.class, 993);
//        if (student != null) {
//            session.delete(student);
//            System.out.println("student 1 is deleted");
//        }
//
//        // Delete a transient object
//        Student student2 = new Student();
//        student2.setId(2);
//        session.delete(student2);
//        System.out.println("Student 2 is deleted");
        
        
     // Delete a persistent object
       Student student = session.get(Student.class, 996);
     if (student != null) {
            session.remove(student);
            System.out.println("student 1 is deleted");
        }

    
        
        
        tx.commit();
        
        session.close();
        
        factory.close();
        
        
    }
}
