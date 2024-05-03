package step1;
import java.util.*;

/* 명예의 전당 (풀이중) */
public class P138477 {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];

        List<Integer> list = new ArrayList<>();
        list.add(score[0]);

        for(int i = 0; i < len; i++) {
            answer[i] = list.get(0);

            if(list.size() == k) {
                if(list.get(0) < score[i])
                    list.remove(0);
                else
                    continue;
            }

            list.add(score[i]);
            Collections.sort(list);
        }

        return answer;
    }
}
