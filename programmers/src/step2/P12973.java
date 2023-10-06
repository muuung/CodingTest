package step2;
import java.util.Stack;

/* 짝지어 제거하기 (통과) */
public class P12973 {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(stack.empty() || !stack.peek().equals(s.substring(i, i+1))) {
                stack.push(s.substring(i, i+1));
            } else {
                stack.pop();
            }
        }
        
        if(stack.empty()) answer = 1;
        return answer;
    }
}