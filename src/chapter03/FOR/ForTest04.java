package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
	
		int num;
		int total=0;
		
		for(num=0; num<=100; num++) {
			//if���� �����϶��� ���� ���־ ��
			if(num%2 ==0) 
				continue;//�׳� ������
			
			total +=num;
			
		}//for end
		System.out.println("0~100������ �� �� Ȧ�� ���� �� :" + total);
		
		//1~20������ �� �� Ȧ���� ���
		for(num=0; num<=20; num++) {
			
			if(num%2 !=0) 
				System.out.println(num);
			
		}//for end
	}
}
