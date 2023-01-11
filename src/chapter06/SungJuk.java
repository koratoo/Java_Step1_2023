package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	//jvm
	//멤버 변수 또는 필드
	private String std_num;
	private String std_name;
	private int java,oracle,spring;
	
	//디폴트 생성자-반드시 클래스 이름과 같아야 함
	//클래스 메모리를 만드는 주인공이기 때문에.
	
	//메서드
	public void Sum() {
		int total=java +oracle+spring;
		System.out.println("총 합계 : " + total);
	}
	
	public void Avg() {
		int avg = (java+oracle+spring)/3;
		System.out.println("평균 : " +avg);
	}
	
	//main Jdk
	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk();//성적의 변수,함수 = 생성자를 만들어주라
		
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("이름");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클 입력"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링 입력"));
		
		System.out.println("학번: " + rec.std_num+"| 성명 -"+rec.std_name+"님의 성적입니다.");
		System.out.println("=========================================================");
		rec.Sum();
		rec.Avg();
	}
}
