package step2;

public class run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
		P152996 p = new P152996();
		int arr[] = {100, 180, 360, 100, 270};
		
		try {
			System.out.println(p.solution(arr));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}