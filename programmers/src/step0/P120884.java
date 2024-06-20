package step0;

/* 치킨 쿠폰 (통과) */
public class P120884 {
    public int solution(int chicken) {
        int cnt = 0;
        while(chicken > 9) {
            cnt += chicken/10;
            chicken = chicken/10 + chicken%10;
        }
        return cnt;
    }
}