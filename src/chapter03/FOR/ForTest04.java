package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
	
		int num;
		int total=0;
		
		for(num=0; num<=100; num++) {
			//if문이 한줄일때는 블럭을 안주어도 됨
			if(num%2 ==0) 
				continue;//그냥 가세요
			
			total +=num;
			
		}//for end
		System.out.println("0~100까지의 수 중 홀수 값의 합 :" + total);
		
		//1~20까지의 수 중 홀수만 출력
		for(num=0; num<=20; num++) {
			
			if(num%2 !=0) 
				System.out.println(num);
			
		}//for end
	}
}
