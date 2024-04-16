package step2;
import java.util.*;

/* 영어 끝말잇기 (통과) */
public class P12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for(int i = 1; i < words.length; i++) {
            if(!set.add(words[i])
               || words[i].charAt(0)
               != words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
        }

        return answer;
    }
}