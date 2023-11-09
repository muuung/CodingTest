package step3;

/* 연속 펄스 부분 수열의 합 (풀이중) */
public class P161988 {
    public long solution(int[] sequence) {
        int oddSum = 0;
        int eveSum = 0;
        int sum = 0;
        int num = 0;
        
        for(int i = 0; i < sequence.length; i++) {
            for(int j = i; j < sequence.length; j++) {
                if(j%2 != 0) {
	                oddSum += sequence[j] * -1;
	                eveSum += sequence[j];
	            } else {
	                oddSum += sequence[j];
	                eveSum += sequence[j] * -1;
	            }
	            
                sum = oddSum > eveSum ? oddSum : eveSum;
				if(num < sum) num = sum;
	        }
            oddSum = 0;
            eveSum = 0;
        }
        
        return num;
    }
}