package step1;

/* 옹알이 (통과) */
public class P133499 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int cnt = 0;

        for(String bab : babbling) {
            for(String word : words) {
                if(bab.contains(word+word)) break;
                bab = bab.replace(word, "/");
            }
            bab = bab.replace("/", "");
            if(bab.isEmpty()) cnt++;
        }

        return cnt;
    }
}