package step1;

/* 자연수 뒤집어 배열로 만들기 (통과) */
public class P12932 {
    public int[] solution(long n) {
//      int len = Long.toString(n).length();
        int len = (int)Math.log10(n) + 1;
        int[] answer = new int [len];

        for(int i = len-1; i >= 0; i--) {
            answer[i] = (int)(n / Math.pow(10, i));
            n = (long)(n % Math.pow(10, i));
        }

        return answer;
    }
}