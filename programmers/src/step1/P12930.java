package step1;

/* 이상한 문자 만들기 (통과) */
public class P12930 {
    public String solution(String s) {
    	StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
            	sb.append(" ");
                idx = 0;
                continue;
            }
            
            if(idx%2 == 0)
                sb.append(Character.toString(s.charAt(i)).toUpperCase());
            else
            	sb.append(Character.toString(s.charAt(i)).toLowerCase());
            
            idx++;
        }
        
        return sb.toString();
    }
}