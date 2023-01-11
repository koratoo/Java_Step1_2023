package chapter06;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		//规过1
		int values1[] = {1,2,3};
		
		int result = myCom.sum1(values1);
		System.out.println("result : "+result);
		
		
		//规过2
		int result2 =myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result : " + result2);
	} 
	
}
