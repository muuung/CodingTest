package step1;
import java.util.Arrays;

/* 서울에서 김서방 찾기 (통과) */
public class P12919 {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}