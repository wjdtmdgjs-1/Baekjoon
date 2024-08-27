import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");      
        List<String> aa = new ArrayList<>();
        aa= Arrays.asList(a);
        aa.sort(Comparator.reverseOrder());
        System.out.println(aa);
        String c = String.join("", aa);
        answer = c;
        
        return answer;
    }
}