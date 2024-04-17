package step2;

public class Run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
//		P152996 p = new P152996();
//		P49993 p = new P49993();
//		P42885 p = new P42885();
//		P132265 p = new P132265();
//		P12924 p = new P12924();
//		P42577 p = new P42577();
//		P12951 p = new P12951();
//		P12911 p = new P12911();
//		P12909 p = new P12909();
		P42578 p = new P42578();

		String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

		try {
			System.out.println(p.solution(arr));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}		
	}
}