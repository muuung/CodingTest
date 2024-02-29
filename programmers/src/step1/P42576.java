package step1;
import java.util.*;

/* 완주하지 못한 선수 (통과) */
public class P42576 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;

        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[i];

//        다른 풀이 ↓↓
//
//        시간 복잡도의 차이가 큰 편
//        HashMap을 썼을 때 더 빨라졌다!
//
//        String answer = "";
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for(String key : participant) map.put(key, map.getOrDefault(key, 0) + 1);
//        for(String key : completion)  map.put(key, map.get(key) - 1);
//
//        for(String key : map.keySet()) {
//            if(map.get(key) != 0) {
//                answer = key;
//                break;
//            }
//        }
//
//        return answer;
    }
}