package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Start {

	//1~50���� ���� �� ����
	private  int random = new Random().nextInt(50)+1;
	private int count =0;
	private  String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		
		//random ������ ������ up/ ũ�� down / ��ġ�ϸ� -> result="SUCCESS"
		if(mynumber<random) {
			System.out.println("up!");
		}else if(mynumber > random) {
			System.out.println("down!");
		}else {
			System.out.println(count+"ȸ ���� ����!");
			result="SUCCESS";
		}
			
		return result;
	}
	
	
}
