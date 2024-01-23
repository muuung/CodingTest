package step1;

/* 푸드 파이트 대회 (통과) */
public class P134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}