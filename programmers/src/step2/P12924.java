package step2;

/* 숫자의 표현 (통과) */
public class P12924 {
    public int solution(int n) {
        int sum = 0;
        int cnt = 1;

        for(int i = 1; i < n/2+1; i++) {
            sum = 0;
            for(int j = i; j <= n/2+1; j++) {
                sum += j;
                if(n < sum) break;
                if(n == sum) {
                    cnt++;
                    break;
                }
            }
        }

        return cnt;
    }
}