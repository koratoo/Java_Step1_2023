package chapter03.IF;

//1차 프로젝트는 스윙을 사용함
import javax.swing.JOptionPane;

public class IfExample05 {
	
	public static void main(String[] args) {
		
	
	int age;
	int charge;
	
	age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력"));
	
		System.out.println("======입장정보=======");
		
		if(age<=7) {
			charge=1000;
			System.out.println("미 취학 아동");
		}else if(age<=13) {
			charge=2000;
			System.out.println("초등학생");
		}else if(age<=19) {
			charge=3500;
			System.out.println("중,고등학생");
		}else {
			charge=5000;
			System.out.println("성인");
		}
		
		
		System.out.println("나이: " +age +"세");
		System.out.println("요금 : "+charge+"원");
		System.out.println("==================");
	}
}
