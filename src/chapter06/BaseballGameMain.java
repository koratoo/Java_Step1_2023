package chapter06;

public class BaseballGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String check="";
		BaseballGame game = new BaseballGame();
		
		do {
			check = game.check();
			}while(check!="WIN");
	}//main

}//class
