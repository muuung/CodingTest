package step1;

/* 가장 가까운 같은 글자 (통과) */
public class P142086 {
    public int[] solution(String s) {
        int cnt = 0;
        int[] arr = new int[s.length()];
        arr[0] = -1;
        
        for(int i = 1; i < s.length(); i++) {
            for(int j = i-1; j > -1; j--) {
                cnt++;
                if(s.charAt(i) == s.charAt(j)) {
                    arr[i] = cnt;
                    break;
                }
                if(j == 0) arr[i] = -1;
            }
            cnt = 0;
        }
        
        return arr;
    }
}