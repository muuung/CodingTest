package step1;

/* 콜라츠 추측 (풀이중) */
public class P12943 {
    public int solution(int num) {
        int answer = 0;
        
        while(num != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            } else if(num%2 == 0) {
                num /= 2;
            } else {
                num = num*3 + 1; // 여기서 int형의 범위를 벗어날 수 있으므로 long형 변수를 사용해야한다..?
            }
            answer++;
        }
        
        return answer;
    }
}