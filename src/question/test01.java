package question;

public class test01 {
	//바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환 코드 2가지
	public static void main(String[] args) {
		
		short a = 10;
		byte b = 20;
		
		long c = (long)a;
		float d = (float)b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
