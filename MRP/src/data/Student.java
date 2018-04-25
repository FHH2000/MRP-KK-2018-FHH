package data;

public class Student extends Person {
	//
	private int grade;
	//
	public Student() {
		
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student" + " " + super.toString() + " im Jahrgang " + getGrade();
	}
}
