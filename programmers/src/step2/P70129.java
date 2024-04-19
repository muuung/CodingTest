package step2;

/* 이진 변환 반복하기 (통과) */
public class P70129 {
    public int[] solution(String s) {
        String s2;
        int cnt = 0, len = 0, zero = 0;

        while(!s.equals("1")) {
            s2 = s.replace("0", "");
            len = s2.length();
            zero += s.length() - len;
            s = Integer.toBinaryString(len);
            cnt++;
        }

        int[] answer = {cnt, zero};
        return answer;
    }
}