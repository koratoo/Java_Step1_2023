package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum1 =1.2;//8����Ʈ => 4����Ʈ
		float fNum1 =0.9f;//4����Ʈ 
	
		int iNum2 = (int)(dNum1 + fNum1);
	}
}
