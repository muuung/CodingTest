package step1;
import java.util.*;

/* 약수의 개수와 덧셈 (풀이중) */
public class P77884 {
    public int solution(int left, int right) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        // 약수의 개수
        for(; left <= right; left++) {
            for(int i = 1; i <= left; i++) {
                if(set.contains(i)) {
                    break;
                } else if(left%i == 0) {
                    set.add(i);
                    set.add(left/i);
                }
            }
            
            if(set.size()%2 == 0) {
                answer += left;
            } else {
                answer -= left;
            }
            
            set.clear();
        }
        
        return answer;
    }
}