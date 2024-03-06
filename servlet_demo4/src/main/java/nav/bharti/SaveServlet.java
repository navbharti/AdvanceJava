package nav.bharti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveServlet implements Servlet{

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
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(req.getParameter("s_name"));
		
	/*	PrintWriter out = res.getWriter();
		out.print("<h1>" + req.getParameter("s_name")  + "</h1>");
		out.print("<h1>" + req.getParameter("s_age")  + "</h1>");
		out.print("<h1>" + req.getParameter("s_marks")  + "</h1>");
		out.print("<h1>" + req.getParameter("s_gender")  + "</h1>");
		*/
		
		String name = req.getParameter("s_name");
		int age = Integer.parseInt(req.getParameter("s_age"));
		double marks = Double.parseDouble(req.getParameter("s_marks"));
		String gender = req.getParameter("s_gender");
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		s.setMarks(marks);
		s.setGender(gender);
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			
			Transaction tx = session.beginTransaction();
			
			session.save(s);
			
			tx.commit();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}

}
