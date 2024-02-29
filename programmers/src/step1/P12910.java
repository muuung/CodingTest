package step1;
import java.util.*;

/* 나누어 떨어지는 숫자 배열 (풀이중) */
public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;

        for(int i = 0; i < arr.length; i++)
            if(arr[i]%divisor == 0) cnt++;

        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];

        for(int i = 0; i < arr.length; i++)
            if(arr[i]%divisor == 0) answer[--cnt] = arr[i];

        Arrays.sort(answer);

        return answer;

//        다른 풀이 ↓↓
//
//        반환형을 ArrayList<Integer>로 바꾼 후 작성
//        list.add() 메소드가 많이 느린 것 같다..
//        실행 시간 차이가 컸다
//
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(arr);
//
//        for(int i = 0; i < arr.length; i++)
//            if(arr[i]%divisor == 0) list.add(arr[i]);
//
//        if(list.size() == 0) list.add(-1);
//
//        return list;
    }
}