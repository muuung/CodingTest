package step2;

/* 다음 큰 숫자 (통과) */
public class P12911 {
    public int solution(int n) {
        int cnt = binary(n);
        while(cnt != binary(++n)) {}
        return n;
    }

    int binary(int n) {
        int cnt = 0;
        while(n > 1) {
            if(n % 2 == 1) cnt++;
            n /= 2;
        }
        return cnt + n;
    }

//    다른 풀이 ↓↓
//    Integer.bitCount() : true bit(1) 개수를 세주는 함수
//
//    public int solution(int n) {
//        int cnt = Integer.bitCount(n);
//        while(cnt != Integer.bitCount(++n)) {}
//        return n;
//    }
}