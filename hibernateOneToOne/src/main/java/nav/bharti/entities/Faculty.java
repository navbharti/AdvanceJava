package nav.bharti.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "faculty_id")
	private long id;
	
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Department dept;
	
	private Date doj;
	
	private double salary;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(long id, String name, Department dept, Date doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.doj = doj;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", dept=" + dept + ", doj=" + doj + ", salary=" + salary + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
