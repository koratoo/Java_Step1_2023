package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {
	
	public static void main(String[] args) {
	//몇명의 성적을 입력받을 것인지 정수로 인원수를 입력받다.
	//총점과 평균을 구하시오(단, 평균은 실수로 출력)
	
	Scanner sc = new Scanner(System.in);
	int i, sum=0;
	double avg=0;
	
	System.out.println("몇명의 학생 점수를 입력 받으시겠습니까? : ");
	int stu = sc.nextInt();
	
	for(i=0;i<stu;i++) {
		sum+=sc.nextInt();
	}
	
	avg=sum/stu;
	System.out.println(sum);
	System.out.println(avg);
	}
}
