package step2;
import java.util.*;

public class P132265 {
    public int solution(int[] topping) {
    	int answer = 0;
    	HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < topping.length; i++) {
        	map.put(topping[i], map.getOrDefault(topping[i], 0));
        }
        
        for(int i = 0; i < topping.length-1; i++) {
        	map.put(topping[i], map.get(topping[i])-1);
        	set.add(topping[i]);
        	if(map.get(topping[i]) == 0) map.remove(topping[i]);
        	if(map.size() == set.size()) answer++;
        }
        
        return answer;
    }
}