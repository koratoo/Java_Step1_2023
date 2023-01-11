package chapter04.Example;

import java.util.Scanner;

public class Example03 {
	
	static int score[] = new int[10];
	static int stuNum;//학생수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pickNum=0;
		int max=0;
		double total=0;
		double avg=0;
		
		
		while(pickNum!=5) {
			System.out.println("===========================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("===========================================");
		
			System.out.print("선택>");
			pickNum = sc.nextInt();
			
			switch (pickNum) {
			case 1:

				System.out.print("학생수를 입력해 주세요(최대 10명)>");
				stuNum =sc.nextInt();
				break;
			case 2:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						System.out.print("score["+i+"]>");
						score[i]=sc.nextInt();
					}
				}else if(stuNum==0){
					System.out.println("학생 수를 입력해 주세요.");
				}
				break;	
			case 3:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						System.out.println("score["+i+"] : " + score[i]);
					}
				}else if(stuNum==0){
					System.out.println("등록된 학생 정보가 없습니다.");
				}
				break;
			case 4:
				if(stuNum>0) {
					for(int i=0; i<stuNum; i++) {
						if(max<score[i]) 
							max=score[i];
					}//최댓값 for
					
					for(int i=0; i<stuNum; i++) {
						total+=score[i];
					}
					avg=total/(double)stuNum;
					
					System.out.println("최고 점수 : " + max);
					System.out.println("총점 : " + total);
					System.out.println("평균 : " + avg);
				}
				else if(stuNum==0){
					System.out.println("등록된 학생 정보가 없습니다.");
				}
				
				break;
			default:
				if(pickNum>5 || pickNum<1)
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
			
			
		}//while end
	
	System.out.println("프로그램이 종료 되었습니다.");
	
	}
}
