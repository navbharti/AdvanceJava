package nav.bharti;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nav.bharti.entities.Department;
import nav.bharti.entities.Faculty;
import nav.bharti.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
        	Faculty faculty = new Faculty();
        	//faculty.setId(111);
        	faculty.setName("Dr. Naveen Kumar");
        	faculty.setSalary(55000);
        	faculty.setDoj(Date.valueOf(LocalDate.now()));
        	
        	Department dept = new Department();
        	//dept.setId(987);
        	dept.setDeptName("Amity Institute of Information Technology");
        	
        	faculty.setDept(dept);
        	tx = session.beginTransaction();
        	session.save(faculty);
        	session.save(dept);
        	tx.commit();
        	session.close();
        }catch (Exception e) {
			// TODO: handle exception
        	tx.rollback();
        	e.printStackTrace();
		}
    }
}
