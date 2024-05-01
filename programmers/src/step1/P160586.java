package step1;

import java.util.HashMap;
import java.util.Map;

/* 대충 만든 자판 */
public class P160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int len = targets.length;
        int[] answer = new int[len];

        int cnt = 0;
        char key = ' ';

        // 최소 횟수를 기억해 줄 map
        Map<String, Integer> map = new HashMap<>();

        // target 메시지의 개수만큼 반복
        for(int i = 0; i < len; i++) {

            // target 메시지 하나의 길이만큼 반복
            for(int j = 0; j < targets[i].length(); j++) {

                // 만약 저장된 최소 횟수가 있다면 map에서 꺼내 더하기
                // 저장된 횟수가 없다면 for문 돌리기...
                key = targets[i].charAt(j);

                if(map.containsKey(key)) {
                    if(map.get(key) == -1)
                        answer[i] = -1;
                    else
                        answer[i] += map.get(key);
                    break;
                }

//                for(int k = 0; k < keymap.length; k++) {
//                    cnt = keymap[i].indexOf(Character.toString(targets[i].charAt(i)));
//                    if(cnt == 0 || map.getOrDefault(targets[i].charAt(i), 101) > cnt)
//                        map.put(targets[i].charAt(i), )
//
//                }



                if(cnt == -1) answer[i] = -1;
            }
        }

        return answer;
    }

    int message(String keymap, String target) {
        int cnt = 0;

        for(int i = 0; i < target.length(); i++) {
            target.indexOf(Character.toString(target.charAt(i)));
        }

        return cnt != 0? cnt : -1;
    }
}