package step1;
import java.util.*;
import java.util.Map.*;

/* 모의고사 (풀이중) */
public class P42840 {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, count(arr1, answers));
        map.put(2, count(arr2, answers));
        map.put(3, count(arr3, answers));

        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        // 여기서 오류..ㅜㅜ
        for(int i = 1; i < 3; i++) {
            if(!list.get(0).getValue().equals(list.get(i).getValue())) {
                list.remove(i);
                i--;
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }

    int count(int[] arr, int[] answers) {
        int idx = 0;
        int cnt = 0;

        for(int i = 0; i < answers.length; i++) {
            if(arr.length == idx) idx = 0;
            if(arr[idx] == answers[i]) cnt++;
            idx++;
        }

        return cnt;
    }
}