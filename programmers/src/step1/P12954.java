package step1;

/* x만큼 간격이 있는 n개의 숫자 (통과) */
public class P12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++)
            answer[i] = (i+1) * (long)x;

        return answer;
    }
}