package chapter06;

public class StudentMain {
	//�ʵ�
	public static void main(String[] args) {
		
	Student student1 = new Student();
	student1.studentName="��ġ";
	student1.address="����� ���α�";
	
	student1.showStudentInfo();
	System.out.println("==========================");
	
	Student student2 = new Student();
	student2.setStudentName("�ڼ�");
	student2.setAddress("��� ���");
	
	student2.showStudentInfo();
	System.out.println("==========================");
	
	Student student3 = new Student("��ġ��","���� ȭ��");
	student3.showStudentInfo();
	}
}
