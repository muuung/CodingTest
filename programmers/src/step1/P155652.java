package step1;

/* 둘만의 암호 (통과) */
public class P155652 {
    public String solution(String s, String skip, int index) {
        char c;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            for(int j = 0; j < index; j++) {
                if(c++ == 'z')
                    c = 'a';
                if(skip.indexOf(c) != -1)
                    j--;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}