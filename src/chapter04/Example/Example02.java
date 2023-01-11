package chapter04.Example;

public class Example02 {

	public static void main(String[] args) {
		int max=0;
		int array[]= {1,6,9,2,35,178,234,4,5,11};
		
		for(int i=0; i<array.length;i++) {
			if(max<array[i])
				max=array[i];
		}//for
		System.out.println(max); 
	}
}
