package step1;

/* 옹알이 (풀이중) */
public class P133499 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                babbling[i] = babbling[i].replaceFirst(arr[j], "");
            }
            if(babbling[i].equals("")) answer++;
        }

        return answer;
    }
}
