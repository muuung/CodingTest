package step1;

/* 수박수박수박수박수박수? (통과) */
public class P12922 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if(i%2 != 0) sb.append("수");
            else         sb.append("박");
        }

        return sb.toString();
    }
}