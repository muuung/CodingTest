package step3;
import java.util.*;

/* 정수 삼각형 (통과) */
public class P43105 {
    public int solution(int[][] triangle) throws Exception {
    	int tLen = triangle.length;
        
        if(tLen < 1 || tLen > 500)
        	throw new Exception("삼각형의 높이는 1 이상 500 이하입니다.");
        
        for(int i = 0; i < tLen; i++) {
        	for(int j = 0; j < triangle[i].length; j++) {
        		
        		if(triangle[i][j] < 0 || triangle[i][j] > 9999)
        			throw new Exception("삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.");
        		
    			if(i == 0 && j == 0) break;
    			
    			if(j == 0) {
    				triangle[i][j] += triangle[i-1][j];
    				continue;
    			}
    			
    			if(j == i) {
    				triangle[i][j] += triangle[i-1][j-1];
    				break;
    			}
    			
    			if(triangle[i-1][j-1] > triangle[i-1][j])
    				triangle[i][j] += triangle[i-1][j-1];
    			else
    				triangle[i][j] += triangle[i-1][j];
        	}
        }
        
        Arrays.sort(triangle[tLen-1]);
		return triangle[tLen-1][tLen-1];
    }
}