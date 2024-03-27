package step1;

/* 최소직사각형 (통과) */
public class P86491 {
    public int solution(int[][] sizes) {
        int m1 = 0, m2 = 0;
        for(int[] size : sizes) {
            m1 = Math.max(m1, Math.max(size[0], size[1]));
            m2 = Math.max(m2, Math.min(size[0], size[1]));
        }
        return m1 * m2;
    }
}