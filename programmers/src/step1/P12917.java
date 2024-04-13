package step1;
import java.util.Arrays;

/* 문자열 내림차순으로 배치하기 (통과) */
public class P12917 {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--)
            sb.append(arr[i]);

        return sb.toString();
    }
}