package chapter05;

public class TryCatchThrows {

	public static void fun() throws Exception{
		//메인은 아니고 메서드를 호출할때 문제가 생겼을 경우 던져준다.
		try { //정상코드
			System.out.println("fun()메서드 실행");
			throw new Exception();
		} catch (RuntimeException e) { 
			//RuntimeException 실행 중 발생하는 Exception
			// 에러시 수행하는 수행문
			System.out.println("예외발생");
			
		}
	}
	
	
	public static void main(String[] args) {
		//throws Exception 메소드 이므로 try catch로 호출
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}
		
	}//main
}
