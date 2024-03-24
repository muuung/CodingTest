package step1;
import java.util.*;

/* [PCCE 기출문제] 10번 / 데이터 분석 (통과) */
public class P250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = index(ext);
        int sortIdx = index(sort_by);
        Map<Integer, int[]> map = new HashMap<>();

        for(int[] row : data)
            if(row[extIdx] < val_ext) map.put(row[sortIdx], row);

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int[][] answer = new int[map.size()][4];
        int idx = 0;

        for(int key : keySet)
            answer[idx++] = map.get(key);

        return answer;
    }

    int index(String data) {
        switch(data) {
            case "code"    : return 0;
            case "date"    : return 1;
            case "maximum" : return 2;
        }
        return 3;
    }
}