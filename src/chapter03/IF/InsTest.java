package chapter03.IF;

//���� Ŭ����
class clsA{
	
	void function() {
		System.out.println("������");
	}
}//clsA

class clsB extends clsA{

}//clsB
//=============================================

public class InsTest {

	public static void main(String[] args) {
		//clsB�� �ν��Ͻ� ����
		clsB objB = new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("Yes A"); 
			objB.function();
		}//if
		
		if(objB instanceof clsB) {
			System.out.println("Yes B");
		}
	}
}
