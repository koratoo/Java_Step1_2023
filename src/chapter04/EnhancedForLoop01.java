package chapter04;

//향상된 for문
public class EnhancedForLoop01 {
	
	public static void main(String[] args) {
		
		String strArray[] = {"Java","Oracle","[Html5,CSS,JS,ViewJS]","JSP","Spring","PythonCamp"}; 
		
		for(String s : strArray) {
			System.out.print(s +", ");
		}
	}

}
