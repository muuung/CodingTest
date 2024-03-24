package step1;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
//		P12928 p = new P12928();
//		P12944 p = new P12944();
//		P176963 p = new P176963();
//		P147355 p = new P147355();
//		P12932 p = new P12932();
//		P68935 p = new P68935();
		P250121 p = new P250121();

		int[][] arr = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};

		try {
			for(int[] a : p.solution(arr, "date", 20300501, "remain"))
				System.out.println(Arrays.toString(a));

		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}