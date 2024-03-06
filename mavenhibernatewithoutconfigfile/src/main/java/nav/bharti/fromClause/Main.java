package nav.bharti.fromClause;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		//your logic goes here
		String query = "From Student";
		
		 List<Student> students = session.createQuery(query).list();
		System.out.println(students);
		for(Student s: students) {
			//System.out.println("inside for loop");
			System.out.println(s);
		}
		
		//Student s = new Student(111, "Bablu", 22, 55, "male");
		//session.save(s);
		
		tx.commit();
		session.close();
	}

}
