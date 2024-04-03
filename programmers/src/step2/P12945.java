package step2;

/* 피보나치 수 (통과) */
public class P12945 {
    public int solution(int n) {
        int answer = 0, f1 = 0, f2 = 1;

        for(int i = 2; i <= n; i++) {
            answer = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = answer;
        }

        return answer;
    }

//    다른 풀이 ↓↓
//    함수 호출 -> 시간 초과로 Fail
//
//    int f(int n) {
//        if(n == 0 || n == 1 || n == 2) return 1;
//        return f(n-1) + f(n-2);
//    }
}