package step2;

public class run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
//		P152996 p = new P152996();
//		P49993 p = new P49993();
//		P42885 p = new P42885();
		P132265 p = new P132265();
		
		int arr[] = {1, 2, 1, 3, 1, 4, 1, 2};
		
		try {
			System.out.println(p.solution(arr));	
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}		
	}
}