package step1;

/* 하샤드 수 (통과) */
public class P12947 {
    public boolean solution(int x) {
        int num = x, sum = 0;

        for(int i = 0; i <= Math.log10(x); i++) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0;
    }
}