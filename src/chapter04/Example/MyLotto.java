package chapter04.Example;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyLotto {
	
	public static void main(String[] args) {
		
		//�ζǹ�ȣ 6���� ���� �迭
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		int[] one = new int[6];
		
		System.out.println("���� ��÷��ȣ");
		for(int i=0; i<6; i++) {
			one[i] = (int) (Math.random()*45)+1;
			System.out.print(one[i] + " ");
		}

		System.out.println();
		
		System.out.println("=====�ζǸ� �� �� ��ðڽ��ϱ�?=====");
		number=Integer.parseInt(JOptionPane.showInputDialog("���� �Է�!"));
		while(number>cnt) {
			cnt++;
			System.out.print(cnt+"��"+" : ");
			
			outer:
			for(int i=0; i<6;i++) {
				lotto[i] =(int) (Math.random()*45)+1;
				System.out.print(lotto[i] + " ");
				
				//�ߺ����� ���ϴ� ���
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
