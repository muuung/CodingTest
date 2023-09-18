package step2;

public class run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
//		P152996 p = new P152996();
//		P49993 p = new P49993();
		P42885 p = new P42885();
		
		int arr[] = {70, 50, 80, 50};
		int limit = 100;
		
		try {
			System.out.println(p.solution(arr, limit));
			
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}