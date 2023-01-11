package chapter06;

public class StudentMain {
	//필드
	public static void main(String[] args) {
		
	Student student1 = new Student();
	student1.studentName="김치";
	student1.address="서울시 종로구";
	
	student1.showStudentInfo();
	System.out.println("==========================");
	
	Student student2 = new Student();
	student2.setStudentName("박수");
	student2.setAddress("경기 고양");
	
	student2.showStudentInfo();
	System.out.println("==========================");
	
	Student student3 = new Student("김치즈","서울 화곡");
	student3.showStudentInfo();
	}
}
