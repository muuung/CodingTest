package step2;

/* 두 원 사이의 정수 쌍 (통과) */
public class P181187 {
    public long solution(int r1, int r2) {
        double r11 = Math.pow(r1, 2);
        double r22 = Math.pow(r2, 2);
        double d = 0, y = 0;
        long answer = 0;

        for(int x = 0; x < r2; x++) {
            d = Math.pow(x, 2);
            y = Math.sqrt(r22 - d);

            if(x >= r1) {
                answer += (long)y;
            } else {
                answer += Math.floor(y) - Math.ceil(Math.sqrt(r11 - d)) + 1;
            }
        }

        return answer * 4;

//        다른 풀이 ↓↓
//
//        long answer = 0, y1 = 0, y2 = 0;
//
//        for(int x = 1; x <= r2; x++) {
//            y1 = (long)Math.ceil(Math.sqrt((long)r1 * r1 - (long)x * x));
//            y2 = (long)Math.floor(Math.sqrt((long)r2 * r2 - (long)x * x));
//            answer += y2 - y1 + 1;
//        }
//
//        return answer * 4;
    }
}