package step2;
import java.util.*;

/* 시소 짝꿍 (통과) */
public class P152996 {
    public long solution(int[] weights) throws Exception {
        if(weights.length < 2 || weights.length > 100000)
        	throw new Exception("몸무게 목록의 길이는 2 이상 100,000 이하입니다.");
        
        long answer = 0;
        Arrays.sort(weights);
        
        for(int i = 0; i < weights.length; i++) {
        	if(weights[i] < 100 || weights[i] > 1000)
        		throw new Exception("몸무게는 100 이상 1,000 이하의 정수입니다.");
        		
        	if(i == weights.length-1) break;
        	
        	for(int j = i+1; j < weights.length; j++) {
        		if(weights[i] == weights[j] || weights[i]*2 == weights[j] ||
        		   weights[i]*3 == weights[j]*2 || weights[i]*4 == weights[j]*3)
        			answer++;
        		
        		if(weights[i]*2 < weights[j]) break;
        	}
        }
        
        return answer;
    }
}