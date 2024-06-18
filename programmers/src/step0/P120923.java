package step0;

/* 연속된 수의 합 (통과) */
public class P120923 {
    public int[] solution(int num, int total) {
        int sum = 0;

        for(int i = 1; i < num; i++)
            sum += i;

        int answer = (total - sum) / num;
        int[] arr = new int[num];

        for(int i = 0; i < num; i++)
            arr[i] = answer++;

        return arr;
    }
}