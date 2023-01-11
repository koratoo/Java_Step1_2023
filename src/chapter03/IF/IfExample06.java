package chapter03.IF;

public class IfExample06 {
	
	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6)+1;
		
		//1~6Á¡±îÁö ¹ÞÀ» ¼ö ÀÖÀ½, °¢ Á¡¼ö´ç ºÐ½Ä ½î±â
		if(num == 1) {
		    System.out.println("1Á¡ => ¼ø´ë");
		}else if(num == 2) {
			System.out.println("2Á¡ => ¶±ººÀÌ");
		}else if(num == 3) {
			System.out.println("3Á¡ => ¶±¼øÆ¢");
		}else if(num == 4) {
			System.out.println("4Á¡ => ¶±¼øÆ¢¿À");
		}else if(num == 5) {
			System.out.println("5Á¡ => ¶±¼øÆ¢¿À + ÄÝ¶ó");
		}else {
			System.out.println("6Á¡ => ºÐ½Ä¼¼Æ® ÇÁ¸®¹Ì¾ö");
		}
		
	}
}
