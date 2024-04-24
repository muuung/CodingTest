package step2;

/* 2개 이하로 다른 비트 */
public class P77885 {
    public long[] solution(long[] numbers) {
        long[] answer = {};
        long a = 0;

        for(int i = 0; i < numbers.length; i++) {
            a = numbers[i];
            while(true) {
                if(Math.abs(Long.bitCount(numbers[i]) - Long.bitCount(++a)) < 3) {
                    numbers[i] = a;
                    break;
                }
            }
        }

        return numbers;
    }
}