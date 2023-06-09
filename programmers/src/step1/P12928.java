package step1;

/* 약수의 합 (통과) */
public class P12928 {
	public int solution(int n) throws Exception {
	    int answer = 0;
	    
	    if(n < 0 || n > 3000)
	    	throw new Exception("n은 0 이상 3000 이하의 정수입니다.");
	    	
        for(int i = 1; i <= n/2; i++)
            if(n%i == 0) answer += i;
	    
	    return answer + n;
	}
}