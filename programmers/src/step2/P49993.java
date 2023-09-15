package step2;

import java.util.regex.Pattern;

/* 스킬트리 (풀이중) */
public class P49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String regex = "[A-Z]*";
        
        StringBuilder pattern = new StringBuilder();
        
        for(int i = 0; i < skill.length(); i++) {
        	if(i == 0) pattern.append(regex);
        	
        	pattern.append(skill.substring(i, i+1));
        	pattern.append(regex);
        }
        
        System.out.println(String.valueOf(pattern));
        
        for(int i =0; i < skill_trees.length; i++) {
        	if(Pattern.matches(String.valueOf(pattern), skill_trees[i])) {
        		answer++;
        	}
        }
        
        if(answer == 0) answer = -1;
        
        return answer;
    }
}