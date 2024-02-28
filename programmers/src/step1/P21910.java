package step1;
import java.util.*;

/* 나누어 떨어지는 숫자 배열 (풀이중) */
public class P21910 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;

        for(int i = 0; i < arr.length; i++)
            if(arr[i]%divisor == 0) cnt++;

        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];

        for(int i = 0; i < arr.length; i++)
            if(arr[i]%divisor == 0) answer[--cnt] = arr[i];

        Arrays.sort(answer);

        return answer;
    }
}