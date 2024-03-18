package step1;

/* 3진법 뒤집기 (통과) */
public class P68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        sb.reverse();
        int sum = 0;

        for(int i = 0; i < sb.length(); i++)
            sum += Character.getNumericValue(sb.charAt(i)) * Math.pow(3, i);

        return sum;

//        다른 풀이 ↓↓
//
//        Stack<Integer> stack = new Stack<>();
//
//        while(n > 0) {
//            stack.push(n % 3);
//            n /= 3;
//        }
//
//        int idx = 0;
//        int sum = 0;
//
//        while(!stack.isEmpty())
//            sum += stack.pop() * Math.pow(3, idx++);
//
//        return sum;
    }
}