package step2;
import java.util.*;

/* 귤고르기 (통과) */
public class P138476 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i : tangerine)
            map.put(i, map.getOrDefault(i, 0) + 1);
       
        List<Integer> list = new ArrayList<>(map.keySet());        
        Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        for(Integer key : list) {
            k -= map.get(key);
            answer++;
            if(k <= 0) break;
        }
        
        return answer;
    }
}