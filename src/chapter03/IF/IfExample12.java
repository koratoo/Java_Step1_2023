package chapter03.IF;

import java.util.Scanner;

public class IfExample12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ID = "soldesk";
		int pw= 1234;
		
		String inputID =sc.nextLine();
		
		if(ID.equals(inputID)) {
			int pwc = sc.nextInt();
			if(pw!=pwc) {
				System.out.println("비밀번호가 다릅니다.");
			}else {
				System.out.println("로그인 성공");
			}
			
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}
