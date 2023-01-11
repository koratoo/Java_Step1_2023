package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Start {

	//1~50까지 정수 중 추출
	private  int random = new Random().nextInt(50)+1;
	private int count =0;
	private  String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		
		//random 값보다 작으면 up/ 크면 down / 일치하면 -> result="SUCCESS"
		if(mynumber<random) {
			System.out.println("up!");
		}else if(mynumber > random) {
			System.out.println("down!");
		}else {
			System.out.println(count+"회 만에 정답!");
			result="SUCCESS";
		}
			
		return result;
	}
	
	
}
