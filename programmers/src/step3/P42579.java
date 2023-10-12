package step3;
import java.util.*;

/* 배스트앨범 (통과) */
public class P42579 {
	public int[] solution(String[] genres, int[] plays) {
        int len = genres.length;
        int count = 0;
        HashMap<String, Integer> gMap = new HashMap<String, Integer>();
        HashMap<Integer, Integer> pMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < len; i++) {
            gMap.put(genres[i], gMap.getOrDefault(genres[i], 0) + plays[i]);
            pMap.put(i, plays[i]);
        }
        
        List<String> gKeySet = new ArrayList<>(gMap.keySet());
        gKeySet.sort((o1, o2) -> gMap.get(o2).compareTo(gMap.get(o1)));
        
        List<Integer> pKeySet = new ArrayList<>(pMap.keySet());
        pKeySet.sort((o1, o2) -> pMap.get(o2).compareTo(pMap.get(o1)));
        
        List<Integer> list = new ArrayList<>();
        
        for(String key : gKeySet) {
            for(int i = 0; i < len; i++) {
                if(genres[pKeySet.get(i)].equals(key)) {
                    list.add(pKeySet.get(i));
                    count++;
                }
                
                if(count == 2) break;
            }
            
            count = 0;
        }
        
        int[] best = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            best[i] = list.get(i);
        }
        
        return best;
    }
}