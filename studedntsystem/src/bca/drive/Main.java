package bca.drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import bca.jdbc.Student;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/hospital";
		String username = "root";
	 	String pwd = "navbharti";
		
		Connection con = DriverManager.getConnection(url, username, pwd);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		stud.insertStudent(con, sc);
		
		stud.displayStudents(con);
		
		stud.updateStudent(con, sc);
		
		stud.removeStudent(con, sc);
		
		
		
	}

}
