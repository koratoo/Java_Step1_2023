package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int JavaScore[][] = new int[2][3];
		
		for(int i=0; i<JavaScore.length;i++) {
			for(int j=0; j<JavaScore[i].length;j++) {
				JavaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("6개의 " + "숫자를 입력하세요"));
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(JavaScore[i][j] + " ");
			}
			System.out.println();
		}
	}
}
