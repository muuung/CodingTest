package step1;

/* 부족한 금액 계산하기 (통과) */
public class P82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++)
            answer += price * i;
        
        answer = money - answer;
        return answer < 0? -answer : 0;
    }
}