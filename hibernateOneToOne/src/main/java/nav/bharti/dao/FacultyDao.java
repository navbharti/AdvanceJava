package nav.bharti.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nav.bharti.entities.Faculty;
import nav.bharti.util.HibernateUtil;

public class FacultyDao {
	public void saveFaculty(Faculty faculty) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			session.save(faculty);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void deleteFaculty(int id) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			Faculty faculty = session.get(Faculty.class, id);
			session.remove(faculty);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updateFaculty(Faculty faculty) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			session.save(faculty);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Faculty getFaculty(int id) {
		Transaction tx = null;
		Faculty faculty = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			 faculty = session.get(Faculty.class, id);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return faculty;
	}
	
	public List<Faculty> getFaculties(){
		Transaction tx = null;
		List<Faculty> faculties = new ArrayList<Faculty>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			faculties = session.createQuery("from Faculty").list();
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return faculties;
	}
}
