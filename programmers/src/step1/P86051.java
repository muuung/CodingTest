package step1;
import java.util.Arrays;

/* 없는 숫자 더하기 (통과) */
public class P86051 {
    public int solution(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}