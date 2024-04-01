package step2;

public class P181187 {
    public long solution(int r1, int r2) {
        double r12 = Math.pow(r1, 2);
        double r22 = Math.pow(r2, 2);
        double d = 0, y = 0;
        long answer = 0;

        for(int x = 0; x < r2; x++) {
            d = Math.pow(x, 2);
            y = Math.sqrt(r22 - d);

            if(x >= r1) {
                answer += (int)y;
            } else {
                // 코드 추가 예정
            }
        }

        return answer * 4;
    }
}