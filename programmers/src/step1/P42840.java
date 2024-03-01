package step1;
import java.util.Arrays;

/* 모의고사 (풀이중) */
public class P42840 {
    public int[] solution(int[] answers) {
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i = 0; i < answers.length; i++) {
            if(arr1[idx1] == answers[i]) cnt++;
        }
    }
}