package step2;
import java.util.Arrays;

/* 최솟값 만들기 (통과) */
public class P12941 {
    public int solution(int []A, int []B) {
        int aIdx = A.length - 1;
        int bIdx = 0, sum = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        while(aIdx != -1)
            sum += A[aIdx--] * B[bIdx++];

        return sum;
    }
}