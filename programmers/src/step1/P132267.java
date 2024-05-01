package step1;

/* 콜라 문제 (통과) */
public class P132267 {
    public int solution(int a, int b, int n) {
        int answer = 0, min = a - b;
        while(n >= a) {
            n -= min;
            answer += b;
        }
        return answer;
    }
}