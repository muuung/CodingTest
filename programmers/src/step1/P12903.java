package step1;

public class P12903 {
    public String solution(String s) {
        String answer = s.charAt(s.length()/2);
        
        if(s.length()%2 == 0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        
        return answer;
    }
}