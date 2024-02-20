package step1;

/* 핸드폰 번호 가리기 (통과) */
public class P12948 {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++)
            sb.append("*");

        sb.append(phone_number.substring(len));
        return sb.toString();
    }
}