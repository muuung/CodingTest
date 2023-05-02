package step2;
import java.util.*;

public class P154539 {
	public int[] solution(int[] numbers) {
		int num = 0;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(numbers[numbers.length-1]);
		numbers[numbers.length-1] = -1;
		
		for(int i = numbers.length-2; i >= 0; i--) {
			if(numbers[i] < stack.peek()) {
				num = numbers[i];
				numbers[i] = stack.peek();
				stack.push(num);
				
			} else {
				stack.pop();
				
				if(stack.size() != 0) {
					i++;
					continue;
				}
				
				stack.push(numbers[i]);
				numbers[i] = -1;
			}
		}
		
		stack.clear();
		return numbers;
    }
}