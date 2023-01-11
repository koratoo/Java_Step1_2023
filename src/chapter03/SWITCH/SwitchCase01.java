package chapter03.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking = 1;
		char medalColor;
		
		switch (ranking) {
		case 1:
			medalColor ='G';
			break;
		case 2:
			medalColor ='S';
			break;
		case 3:
			medalColor ='B';
			break;
		default:
			medalColor='A';
			break;
		}
	}
}
