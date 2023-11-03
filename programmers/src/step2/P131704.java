package step2;
import java.util.*;

/* 택배상자 (통과) */
public class P131704 {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int idx = 0;
        int box = 1;
        
        while(idx != order.length) {
            if(box == order[idx]) {
                answer++;
                idx++;
            } else {
                if(stack.size() == 0 || stack.peek().intValue() < order[idx]) {
                    stack.push(box);
                } else if(stack.peek().intValue() == order[idx]) {
                    stack.pop();
                    answer++;
                    idx++;
                    box--;
                } else {
                    break;
                }
            }
            
            if(box < order.length) box++;
        }
        
        return answer;
    }
}