package step2;
import java.util.*;

/* 기능개발 (통과) */
public class P42586 {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int day = 1;
        int cnt = 0;

        for(int i = 0; i < speeds.length; i++) {
            if(progresses[i] + speeds[i] * day >= 100) {
                cnt++;
                continue;
            }

            if(cnt != 0) {
                list.add(cnt);
                cnt = 0;
            }

            day++;
            i--;
        }

        list.add(cnt);
        return list;
    }
}