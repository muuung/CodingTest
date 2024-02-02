package step1;
import java.util.Arrays;

/* 폰켓몬 (통과) */
public class P1845 {
    public int solution(int[] nums) {
        int max = nums.length/2;
        int cnt = Arrays.stream(nums).distinct().toArray().length;
        return Integer.min(max, cnt);
//      return max < cnt? max : cnt;
    }
}