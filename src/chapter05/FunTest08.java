package chapter05;

public class FunTest08 {

	//�޼ҵ� : ����Լ�
	public static int Recur(int a) {
		
		int result=0;
		if(a!=1) {
		System.out.print(a +" x " );
		}else {
			System.out.print("1 = ");
		}
		//return (1); // ������ ���� ����
		//return 0;//��������Ǿ����� �Ѿ ���� ����
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
