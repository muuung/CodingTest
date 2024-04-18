package step2;
import java.util.Arrays;

/* 프로세스 (통과) */
public class P42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0, i = 0, max = 0;
        int len = priorities.length;
        boolean flag = true;

        while(flag) {
            max = Arrays.stream(priorities).max().getAsInt();
            for(; i < len; i++) {
                if(priorities[i] == max) {
                    if(i == location) flag = false;
                    priorities[i] = 0;
                    answer++;
                    break;
                }
                if(i == len-1) i = -1;
            }
        }

        return answer;
    }
}