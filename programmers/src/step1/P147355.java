package step1;

/* 크기가 작은 부분 문자열 (풀이중) */
public class P147355 {
    public int solution(String t, String p) {
        int t2 = 0;
        int p2 = Integer.parseInt(p);
        int len = p.length();
        int answer = 0;
        
        for(int i = 0; i <= t.length()-len; i++) {
            t2 = Integer.parseInt(t.substring(i, i+len));
            if(t2 <= p2) answer++;
        }
        
        return answer;
    }
}