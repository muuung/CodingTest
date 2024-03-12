package step1;

/* 크기가 작은 부분 문자열 (통과) */
public class P147355 {
    public int solution(String t, String p) {
        int cnt = 0;
        int len = p.length();
        long p2 = Long.parseLong(p);

        for(int i = 0; i <= t.length()-len; i++) {
            if(Long.parseLong(t.substring(i, i+len)) <= p2)
                cnt++;
        }

        return cnt;
    }
}	