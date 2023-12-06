package step1;

/* 카드 뭉치 (통과) */
public class P159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        String answer = "Yes";
        
        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cards1[idx1])) {
                if(idx1 < cards1.length-1)
                    idx1++;
            } else if(goal[i].equals(cards2[idx2])) {
                if(idx2 < cards2.length-1)
                    idx2++;
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}