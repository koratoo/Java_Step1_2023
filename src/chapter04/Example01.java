package chapter04;

public class Example01 {

	public static void main(String[] args) {
		//for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		int[][] array= {{95,86},{83,91,96},{71,88,93,87,88}};
		
		int sum=0;
		double avg=0;
		int total=0;
		
		int count=0;
		
		for(int i=0 ; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				total += array[i][j];
				sum+= array[i][j];
				count++;
				
			}
			System.out.println(i+1+" ��° �� ��� : "+sum/(double)array[i].length);
			sum=0;
		}
		
		avg=total/(double)count;
		System.out.println("��ü ��� : " + avg);
		System.out.println("��ü ���� �� : " + count);
	}
}
