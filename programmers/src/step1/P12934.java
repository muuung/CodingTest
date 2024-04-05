package step1;

/* 정수 제곱근 판별 (통과) */
public class P12934 {
    public long solution(long n) {
        long answer = 0, sr = (long) Math.sqrt(n);

        if(sr * sr == n)
            answer = (long) Math.pow(sr+1, 2);
        else
            answer = -1;

        return answer;
    }
}