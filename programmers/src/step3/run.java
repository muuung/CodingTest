package step3;

public class run {
	public static void main(String[] args) {
		P43105 p = new P43105();
		int triangle[][] = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		
		try {
			System.out.println(p.solution(triangle));	
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}