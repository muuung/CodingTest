package step1;

/* 콜라츠 추측 (통과) */
public class P12943 {
    public int solution(int num) {
        long cal = num;
        int cnt = 0;
        
        while(cal != 1 && cnt != 500) {
            if(cal%2 == 0)
                cal /= 2;
            else
                cal = cal*3 + 1;
            cnt++;
        }
        
        return cnt < 500? cnt : -1;
    }
}