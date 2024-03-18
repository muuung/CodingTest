package step1;
import java.util.*;

public class run {
	public static void main(String[] args) {
//		P12928 p = new P12928();
//		P12944 p = new P12944();
//		P176963 p = new P176963();
//		P147355 p = new P147355();
//		P12932 p = new P12932();
		P68935 p = new P68935();

		try {
			System.out.print(p.solution(125));
		} catch(Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
	}
}