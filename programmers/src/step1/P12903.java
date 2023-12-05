package step1;

/* 가운데 글자 가져오기 (통과) */
public class P12903 {
    public String solution(String s) {
        String answer = String.valueOf(s.charAt((s.length()-1)/2));
        if(s.length()%2 == 0)
            answer += String.valueOf(s.charAt(s.length()/2));
        return answer;
    }
}