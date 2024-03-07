package step2;

/* 스킬트리 (통과) */
public class P49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String regex = "[A-Z]*";
        
        String[] skillArr = skill.split("");        // "AB" -> {"A", "B"}
        String skillRegex = String.join(regex, skillArr); // "A[A-Z]*B"
        skillRegex = regex + skillRegex + regex;          // "[A-Z]*A[A-Z]*B[A-Z]*"
        
        int index = 0;             // 스킬트리 배열 인덱스
        String matchString = null; // 매치할 문자열
        boolean flag = false;      // 플래그
        
        while(index < skill_trees.length) {
        	int searchIdx = -1;    // 문자위치 검색
        	
            for(int i = skillArr.length-1; i >= 0; i--) {
            	if(i == 0) {
            		answer++;
            		break;
            	}
            	
            	searchIdx = skill_trees[index].indexOf(skillArr[i]);
            	
            	if(searchIdx != -1) {
            		matchString = skillRegex.substring(0, (skillRegex.indexOf("*"+skillArr[i])+1));
            		skill_trees[index] = skill_trees[index].substring(0, searchIdx);
            		flag = skill_trees[index].matches(matchString);
            		
            		if(flag) answer++;
            		break;
            	}
            }
            
            index++;
        }
        
        return answer;
    }
}