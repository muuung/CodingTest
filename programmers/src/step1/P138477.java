package step1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            }


            list.add(score[i]);
            Collections.sort(list);
        }

        return answer;
    }
}
