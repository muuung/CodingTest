package step1;
import java.util.Arrays;

/* 제일 작은 수 제거하기 (통과) */
public class P12935 {
    public int[] solution(int[] arr) {
        int empty[] = {-1};
        if(arr.length == 1) return empty;
        
        int[] answer = new int[arr.length-1];
        int aIdx = 0;
        int idx = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        
        while(idx < arr.length) {
            if(arr[idx] == min) {
                idx++;
                continue;
            }
            answer[aIdx] = arr[idx];
            aIdx++;
            idx++;
        }
        
        return answer;
    }
}