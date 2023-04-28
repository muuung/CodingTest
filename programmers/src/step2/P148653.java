package step2;
import java.lang.*;

/* 마법의 엘리베이터 (통과) */
public class P148653 {
	public int solution(int storey) throws Exception {
		int answer = 0;

		if(storey < 1 || storey > 1000000000)
			throw new Exception("storey는 1 이상 100,000,000 이하의 정수입니다.");
			
		int length = Integer.toString(storey).length();
		int pow = (int) Math.pow(10, length);
		int mod = 0;
		
		for(int i = 1; i < pow; i*=10) {
			mod = storey%(i*10);
			
			if(mod == 0) continue;
			
			if(mod > i*5 || (mod == i*5 && storey%(i*100) > i*50)) {
				storey += i*10 - mod;
				answer += 10 - mod/i;
			} else {
				storey -= mod;
				answer += mod/i;
			}
		}
		
		while(storey != 0 || pow >= 1) {
			if(storey/pow >= 1) {
				answer += storey/pow;
				storey %= pow;
			}
			
			pow /= 10;
		}
		
		return answer;
    }
}