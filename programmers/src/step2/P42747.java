package step2;
import java.util.Arrays;

/* H-Index (통과) */
public class P42747 {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        
        for(int i = len-1; i > -1; i--) {
            answer = citations[i];

            if(answer <= len-i) {
                while(i != len-1) {
                    if(++answer > citations[i+1] || answer > len-i-1) {
                        answer--;
                        break;
                    }
                }
                break;
                
            } else if(i == 0) {
                while(answer > len) answer--;
                break;
            }
        }
        
        return answer;
    }
}