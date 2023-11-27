package step1;
import java.util.Arrays;

/* 제일 작은 수 제거하기 */
public class P12935 {
    public int[] solution(int[] arr) {
        int[] answer = new int[];
        if(arr.length == 1) {
        } else {
            Arrays.sort(arr);
            for(int i = 1; i < arr.length; i++) {
                answer[i-1] = 0;
            }
        }
        return answer;
    }
}