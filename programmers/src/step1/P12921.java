package step1;

/* 소수 찾기 (통과) */
public class P12921 {
    public int solution(int n) {
        boolean flag = true;
        int cnt = 1;

        for(int i = 3; i <= n; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
            flag = true;
        }

        return cnt;
    }
}