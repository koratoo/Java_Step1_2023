package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		int n = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				 n++;
				 System.out.print((arr[i][j]=n) + " ");
			}//for j end
			System.out.println();
		}//for i end
		
		System.out.println("-----------------------");
		System.out.println(arr.length + "Çà");//ÇàÀÇ °¹¼ö
		System.out.println(arr[0].length + "¿­");//¿­ÀÇ °¹¼ö
		
		System.out.println("----------arr1---------");

		int arr1[][] = {{1,2,3},{4,5,6}};
		System.out.println(arr1.length + "Çà");//ÇàÀÇ °¹¼ö
		System.out.println(arr1[0].length + "¿­");//¿­ÀÇ °¹¼ö
		System.out.println("-----------------------");
	}
}
