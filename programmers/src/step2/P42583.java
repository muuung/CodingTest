package step2;
import java.util.*;

/* 다리를 지나는 트럭 (통과) */
public class P42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int i = 0, sum = 0, time = 0;
        int len = truck_weights.length;
        Queue<Integer> queue = new LinkedList<>();

        do {
            if(i == len || queue.size() == bridge_length)
                sum -= queue.poll();

            if(i < len) {
                if(sum + truck_weights[i] <= weight) {
                    queue.add(truck_weights[i]);
                    sum += truck_weights[i];
                    i++;

                    if(i == len && queue.size() < bridge_length) {
                        time += bridge_length - queue.size();
                    }

                } else {
                    queue.add(0);
                }
            }

            time++;
        } while(!queue.isEmpty());

        return time;
    }
}