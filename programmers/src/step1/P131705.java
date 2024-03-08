package step1;

/* 삼총사 (통과) */
public class P131705 {
    public int solution(int[] number) {
        int len = number.length;
        int cnt = 0;

        for(int i = 0; i < len-2; i++) {
            for(int j = i+1; j < len-1; j++) {
                for(int k = j+1; k < len; k++) {
                    if(number[i]+number[j]+number[k] == 0) cnt++;
                }
            }
        }

        return cnt;
    }
}