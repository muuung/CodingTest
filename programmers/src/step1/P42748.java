package step1;
import java.util.Arrays;

/* K번째수 (통과) */
public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for(int i = 0; i < answer.length; i++)
            answer[i] = cal(array, commands[i]);

        return answer;
    }

    int cal(int[] array, int[] commands) {
        int len = commands[1] - commands[0] + 1;
        int[] cut = new int[len];

        for(int i = 0; i < len; i++)
            cut[i] = array[commands[0]+i-1];

        Arrays.sort(cut);
        return cut[commands[2]-1];
    }
}