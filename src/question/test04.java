package question;

//변수 두개를 선언해서 2.5 / 10을 대입하고
//사칙연산 결과를 정수로 출력
public class test04 {
	public static void main(String[] args) {
		
		double a = 2.5;
		double b = 10;
		int c = (int)a;
		
		double plus = c+b;
		double minus = c-b;
		double multiply = c*b;
		int divide = (int) (c/b);
		
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
	}
}
