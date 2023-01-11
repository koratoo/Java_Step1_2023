package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		//1부터 100까지 합을 구하되 합이 100이하여야 함

		System.out.println("1부터 100까지 합을 구하되 합이 100이하여야 함");
	
		 double num;
		 double sum = 0;
		 
		 while(sum<100) {
		 for(double i =0; i<10;i++) {
			 num = Math.round(Math.random()*10);
			 sum += num;
			 if(sum>=100) {
				 break;
			 }
		 }
		 System.out.println(sum);
		 }
	}
}

//1부터 100까지 합을 구하되 합이 100이하여야 함

//System.out.println("1부터 100까지 합을 구하되 합이 100이하여야 함");
//
//int k;
//int sum2=0;
//for(k=1;k<=100&&sum2<100 ;k++) {
//	sum2+=k;
//}
//System.out.println(k-1);
//System.out.println(sum2-k);
