package step1;

/* 두 정수 사이의 합 (통과) */
public class P12919 {
    public long solution(int a, int b) {
        int num = 0;
        long answer = 0;
        
        if(a > b) {
            num = a;
            a = b;
            b = num;
        }
        
        for(; a <= b; a++)
            answer += a;
        
        return answer;
    }
}