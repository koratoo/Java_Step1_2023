package chapter07;

class Person2{

	//���� Ŭ����
	String name;
	int age;
	
	public Person2(){
		this("�̸�����",0); //Person2(String str, int a)
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age= age;
		
	}
	
	//�ڱ� �ڽ��� �ּ�
	Person2 returnSelf() {
		return this;
	}
	
}

public class CallAnotherConst{
	
}