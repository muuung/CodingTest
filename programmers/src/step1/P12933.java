package step1;
import java.util.Arrays;

/* 정수 내림차순으로 배치하기 (통과) */
public class P12933 {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--)
            sb.append(arr[i]);

        return Long.parseLong(sb.toString());
    }
}