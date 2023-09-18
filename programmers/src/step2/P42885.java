package step2;
import java.util.*;

/* 구명보트 (통과) */
public class P42885 {
    public int solution(int[] people, int limit) {   	
        int answer = 0;
        int sIdx = 0;
        int eIdx = people.length-1;

        Arrays.sort(people);

        if(eIdx == 0) {
            return 1;
        } else if(limit < people[0]+people[1]) {
            return eIdx+1;
        }

        while(sIdx < eIdx) {
            if(limit >= people[sIdx]+people[eIdx]) {
                sIdx++;
            }
            eIdx--;
            answer++;
        }

        if(sIdx == eIdx) answer++;
        return answer;
    }
}