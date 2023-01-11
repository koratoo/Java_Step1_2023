package chapter07;

class Person2{

	//내부 클래스
	String name;
	int age;
	
	public Person2(){
		this("이름없음",0); //Person2(String str, int a)
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age= age;
		
	}
	
	//자기 자신의 주소
	Person2 returnSelf() {
		return this;
	}
	
}

public class CallAnotherConst{
	
}