package chapter05;

public class FunTest08 {

	//메소드 : 재귀함수
	public static int Recur(int a) {
		
		int result=0;
		if(a!=1) {
		System.out.print(a +" x " );
		}else {
			System.out.print("1 = ");
		}
		//return (1); // 오류가 없이 중지
		//return 0;//정상종료되었으나 넘어갈 값이 없음
		if(a==1) {
			return(1);
		}else {
			result=a*Recur(a-1);
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Recur(5));
	}
	
}
