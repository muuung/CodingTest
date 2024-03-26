package step1;
import java.util.Arrays;

/* 과일 장수 (통과) */
public class P135808 {
    public int solution(int k, int m, int[] score) {
        int cnt = 0;
        int sum = 0;
        Arrays.sort(score);

        for(int i = score.length-1; i >= 0; i--) {
            cnt++;
            if(cnt == m) {
                cnt = 0;
                sum += score[i] * m;
            }
        }

        return sum;
    }
}