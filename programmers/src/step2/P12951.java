package step2;

/* JadenCase 문자열 만들기 (통과) */
public class P12951 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;
            if(i == 0 || s.charAt(i-1) == ' ')
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
        }

        return sb.toString();
    }
}