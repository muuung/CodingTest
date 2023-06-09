package step1;

/* 평균 구하기 (통과) */
public class P12944 {
	public double solution(int[] arr) throws Exception {
        double answer = 0;
        
        if(arr.length < 1 || arr.length > 100) 
        	throw new Exception("배열의 길이는 1 이상 100 이하입니다.");
        	
        for(int i : arr) {
            if(i < -10000 || i > 10000)
            	throw new Exception("배열의 원소는 -10,000 이상 10,000 이하의 정수입니다.");
            
            answer += i;
        }

        return answer /= arr.length;
    }
}