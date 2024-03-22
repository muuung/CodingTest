package step2;

public class Run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
//		P152996 p = new P152996();
//		P49993 p = new P49993();
//		P42885 p = new P42885();
//		P132265 p = new P132265();
		P12924 p = new P12924();
		
		try {
			System.out.println(p.solution(15));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}		
	}
}