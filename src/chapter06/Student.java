package chapter06;

public class Student {

	int studentID;
	public String studentName;
	int grade;
	String address;

	//free compile
	public Student() {
		// TODO Auto-generated constructor stub
	}//오버로딩과 같이 쓰려면 반드시 노출해주어야 한다.
	
	//생성자 오버로딩
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}
	
}
