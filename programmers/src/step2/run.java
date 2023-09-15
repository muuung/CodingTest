package step2;

public class run {
	public static void main(String[] args) {
//		P148653 p = new P148653();
//		P152996 p = new P152996();
		P49993 p = new P49993();
		
		String skill = "CBD";
		String arr[] = {"BACDE", "CBADF", "AECB", "BDA"};
		
		try {
			System.out.println(p.solution(skill, arr));
			
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}