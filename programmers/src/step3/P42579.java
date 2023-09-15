package step3;
import java.util.*;

/* 배스트앨범 (풀이중) */
public class P42579 {
	public int[] solution(String[] genres, int[] plays) {
		// 장르별 합 map
        HashMap<String, Integer> genresMap = new HashMap<String, Integer>();
        
        // 장르별 합 구하기
        for(int i = 0; i < genres.length; i++) {
            if(!genresMap.containsKey(genres[i])) {
            	genresMap.put(genres[i], plays[i]);
                continue;
            }

            genresMap.replace(genres[i], genresMap.get(genres[i])+plays[i]);
        }
        
        // 장르별 합 map 정렬
        List<String> gkeySet = new ArrayList<>(genresMap.keySet());
        gkeySet.sort((o1, o2) -> genresMap.get(o2).compareTo(genresMap.get(o1)));
        
        // 장르별 고유번호 map
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        
        // 수록곡 고유번호 list
        List<Integer> indexList = new ArrayList<Integer>();
        
        // 장르별 2곡 수록 count
        int count = 0;
        
        // 장르 비교해서 map에 put
        for(String gkey : gkeySet) {
            for(int i = 0; i < genres.length; i++) {
                if(genres[i] == gkey)
                	indexMap.put(plays[i], i);
            }
            
            // 장르 map 정렬 후 수록곡 list에 add
            List<Integer> iKeySet = new ArrayList<>(indexMap.keySet());     
            Collections.sort(iKeySet);
            Collections.reverse(iKeySet);
            
            for(int pKey : iKeySet) {
            	indexList.add(indexMap.get(pKey));
                count++;
                
                if(count == 2) break;
            }
            
            indexMap.clear();
        	count = 0;
        }
        
        // list -> array
        int[] inc = new int[indexList.size()];
        
        for (int i = 0 ; i < indexList.size(); i++)
        	inc[i] = indexList.get(i).intValue();
        
        return inc;
    }
}