package step2;

/* n^2 배열 자르기 (통과) */
public class P87390 {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right-left) + 1;
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            if(left/n > left%n) {
                arr[i] = (int)(left/n) + 1;
            } else {
                arr[i] = (int)(left%n) + 1;
            }
            left++;
        }
        
        return arr;
    }
}