package step1;
import java.util.*;

/* 같은 숫자는 싫어 (통과) */
public class P12906 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = stack.size()-1; i > -1; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}