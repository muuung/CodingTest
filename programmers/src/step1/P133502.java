package step1;
import java.util.Stack;

/* 햄버거 만들기 (통과) */
public class P133502 {
	public int solution(int[] ingredient) {
        int br = 0; // 빵
        int vg = 0; // 야채
        int mt = 0; // 고기
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient) {
            if(i==1 && stack.size() > 2) {
                mt = stack.pop();
                vg = stack.pop();
                br = stack.peek();
                
                if(br==1 && vg==2 && mt==3) {
                    stack.pop();
                    answer++;
                    continue;
                } else {
                    stack.push(vg);
                    stack.push(mt);
                }
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}