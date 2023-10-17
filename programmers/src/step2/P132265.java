package step2;
import java.util.*;

/* 롤케이크 자르기 (통과) */
public class P132265 {
    public int solution(int[] topping) {
    	int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : topping)
        	map.put(i, map.getOrDefault(i, 0)+1);
        
        for(int i : topping) {
        	if(map.replace(i, map.get(i)-1) == 1) map.remove(i);
        	set.add(i);
        	if(map.size() == set.size()) answer++;
        }
        
        return answer;
    }
}