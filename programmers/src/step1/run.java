package step1;

public class run {
	public static void main(String[] args) {
		P12928 p = new P12928();
//		P12944 p = new P12944();
		
		try {
			System.out.println(p.solution(8));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}