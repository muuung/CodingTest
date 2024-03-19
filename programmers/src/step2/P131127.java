package step2;
import java.util.*;

/* 할인 행사 (통과) */
public class P131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;

        for(int i = 0; i < discount.length - 9; i++) {
            for(int j = 0; j < want.length; j++)
                map.put(want[j], number[j]);

            for(int k = i; k < i + 10; k++) {
                if(!map.containsKey(discount[k])) break;
                map.put(discount[k], map.get(discount[k]) - 1);
                if(map.get(discount[k]) == 0) map.remove(discount[k]);
            }

            if(map.isEmpty()) answer++;
        }

        return answer;
    }
}