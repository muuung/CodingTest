package step1;
import java.util.*;

/* 명예의 전당 (통과) */
public class P138477 {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            if(list.size() == k) {
                if(list.get(0) < score[i]) {
                    list.remove(0);
                }
                else {
                    answer[i] = list.get(0);
                    continue;
                }
            }

            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        return answer;
    }
}
