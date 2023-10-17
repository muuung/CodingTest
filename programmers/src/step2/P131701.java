package step2;
import java.util.*;

/* 연속 부분 수열 합의 개수 (통과) */
public class P131701 {
    // idx = 인덱스 번호, cnt = 재연산 횟수
    int sum(int[] elements, int idx, int cnt) {
        int sum = elements[idx];   
        if(idx == elements.length-1) {
            idx = -1;
        }      
        if(cnt != 0) {
            sum += sum(elements, idx+1, cnt-1);
        }
        return sum;
    }
    
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                set.add(sum(elements, j, i));
            }
        }
        
        return set.size();
    }
}