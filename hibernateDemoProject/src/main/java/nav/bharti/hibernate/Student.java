package nav.bharti.hibernate;

public class Student {
	private int id;
	private String name;
	private int age;
	private double marks;
	private String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, double marks, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		String string = String.format("%d\t%s\t%d\t%f\t%s", id, name, age, marks, gender);
		return string;
	}
	
	
}
