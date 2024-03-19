package step3;

public class Run {
	public static void main(String[] args) {
//		P43105 p = new P43105();
		P42579 p = new P42579();
		
		String genres[] = {"classic", "pop", "classic", "classic", "pop"};
		int plays[] = {500, 600, 150, 800, 2500};
		
		try {
			int arr[] = p.solution(genres, plays);
			
			for(int i : arr)
				System.out.print(i + " ");
			
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}