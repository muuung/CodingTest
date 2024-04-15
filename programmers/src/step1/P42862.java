package step1;
import java.util.*;

/* 체육복 (통과) */
public class P42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        List<Integer> reserveList = new ArrayList<>();
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> overlap = new HashSet<>();

        for(int i : reserve){
            reserveList.add(i);
            overlap.add(i);
        }

        for(int i : lost)
            lostSet.add(i);

        reserveList.removeAll(lostSet);
        lostSet.removeAll(overlap);

        for(int i : reserveList) {
            if(lostSet.remove(i-1)) continue;
            lostSet.remove(i+1);
        }

        return n-lostSet.size();
    }
}