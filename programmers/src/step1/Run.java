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
//		P250121 p = new P250121();
		P42862 p = new P42862();

		int[] arr1 = {2, 4};
		int[] arr2 = {1, 3, 5};

		try {
			System.out.println(p.solution(5, arr1, arr2));

		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}