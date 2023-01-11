package chapter03.IF;

//1차 프로젝트는 스윙을 사용함
import javax.swing.JOptionPane;

public class IfExample04 {
	
	public static void main(String[] args) {
		
	
	int age;
	int charge = 0;
	
	age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력"));
	
		System.out.println("======입장정보=======");
		
		//if
		if(age>0 && age<8) {
			charge=1000;
			System.out.println("미 취학 아동");
		}else if(age>=8 && age<=13) {
			charge=2000;
			System.out.println("초등학생");
		}else if(age>13 && age<=19) {
			charge=3500;
			System.out.println("중,고등학생");
		}else if(age>19 && age<120) {
			charge=5000;
			System.out.println("성인");
		}else {
			System.out.println("신원 조회가 필요합니다.");
		}
		
		
		System.out.println("나이: " +age +"세");
		System.out.println("요금 : "+charge+"원");
		System.out.println("==================");
	}
}
