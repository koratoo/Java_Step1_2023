package chapter04;

public class Example01 {

	public static void main(String[] args) {
		//for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
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
			System.out.println(i+1+" 번째 줄 평균 : "+sum/(double)array[i].length);
			sum=0;
		}
		
		avg=total/(double)count;
		System.out.println("전체 평균 : " + avg);
		System.out.println("전체 과목 수 : " + count);
	}
}
