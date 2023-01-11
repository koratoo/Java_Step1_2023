package chapter04.Example;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyLotto {
	
	public static void main(String[] args) {
		
		//로또번호 6개를 담을 배열
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		int[] one = new int[6];
		
		System.out.println("예상 당첨번호");
		for(int i=0; i<6; i++) {
			one[i] = (int) (Math.random()*45)+1;
			System.out.print(one[i] + " ");
		}

		System.out.println();
		
		System.out.println("=====로또를 몇 장 사시겠습니까?=====");
		number=Integer.parseInt(JOptionPane.showInputDialog("갯수 입력!"));
		while(number>cnt) {
			cnt++;
			System.out.print(cnt+"차"+" : ");
			
			outer:
			for(int i=0; i<6;i++) {
				lotto[i] =(int) (Math.random()*45)+1;
				System.out.print(lotto[i] + " ");
				
				//중복값을 비교하는 방법
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						continue outer;
					}
				}
			}
			
			System.out.println();
		
		
			
			
		}//while
		
		
		
		
		
	}//main

}//class
