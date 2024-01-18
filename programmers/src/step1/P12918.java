package step1;
import java.util.regex.*;

/* 문자열 다루기 기본 (통과) */
public class P12918 {
    public boolean solution(String s) {
        int len = s.length();
        boolean flag = false;
        
        if(len == 4 || len == 6)
            flag = true;
        
        return Pattern.matches("^[0-9]*$", s) && flag;
    }
}