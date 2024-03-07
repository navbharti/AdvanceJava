package nav.bharti;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.Transaction;

public class SelectAllServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig resp) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			Transaction tx = session.beginTransaction();
			
		 List<Student>	students = session.createQuery("from Student").list();
			
		 out.print("<table>");
		 for(Student s: students)
				out.print("<tr><td>"+ s.getId()+"</td><td>"+s.getName()+"</td><td>"+s.getAge()+"</td><td>"+s.getMarks()+"</td><td>"+s.getGender()+"</td><td> <button type='submit' value='Delete'/>");
			
			
		 out.print("</table>");
		 tx.commit();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
