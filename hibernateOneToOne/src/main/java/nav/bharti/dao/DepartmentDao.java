package nav.bharti.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nav.bharti.entities.Department;
import nav.bharti.util.HibernateUtil;

public class DepartmentDao {
	public void saveDepartment(Department department) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			session.save(department);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void deleteDepartment(long id) {
		Transaction tx = null;
		Department dept= null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object remove () operation goes here
			dept = session.get(Department.class, id);
			session.remove(dept);
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updateDepartment(Department department) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			session.saveOrUpdate(department);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Department getDepartment(int id) {
		Transaction tx = null;
		Department dept = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			dept = session.get(Department.class, id);
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return dept;
	}
	
	public List<Department> getDepartments(){
		Transaction tx = null;
		List<Department> depts = new ArrayList<Department>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			
			//your hibernate object save () operation goes here
			depts = session.createQuery("from Department").list();
			
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return depts;
	}
}
