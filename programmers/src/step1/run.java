package step1;
import java.util.*;

public class run {
	public static void main(String[] args) {
//		P12928 p = new P12928();
//		P12944 p = new P12944();
		P176963 p = new P176963();
		
		try {
			String[] arr1 = {"may", "kein", "kain", "radi"};
			int[] arr2 = {5, 10, 1, 3};
			String[][] arr3 = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};			
			int[] answer = p.solution(arr1, arr2, arr3);
			System.out.print(Arrays.toString(answer));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}