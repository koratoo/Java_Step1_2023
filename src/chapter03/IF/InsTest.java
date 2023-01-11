package chapter03.IF;

//내부 클래스
class clsA{
	
	void function() {
		System.out.println("월요일");
	}
}//clsA

class clsB extends clsA{

}//clsB
//=============================================

public class InsTest {

	public static void main(String[] args) {
		//clsB의 인스턴스 변수
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
