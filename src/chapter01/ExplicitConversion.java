package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum1 =1.2;//8바이트 => 4바이트
		float fNum1 =0.9f;//4바이트 
	
		int iNum2 = (int)(dNum1 + fNum1);
	}
}
