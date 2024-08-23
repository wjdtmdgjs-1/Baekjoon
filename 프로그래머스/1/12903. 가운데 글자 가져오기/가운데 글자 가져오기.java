import java.util.*;
class Solution {
    public String solution(String s) {       
        
        String answer = "";
        List<String> aa = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> bb = new ArrayList<>();
        
        
        if(aa.size()%2==0){
                bb.add(aa.get((aa.size()/2)-1));
                bb.add(aa.get(aa.size()/2));
        }else{
                bb.add(aa.get(aa.size()/2));
        }
            
        for (String item : bb) {
                answer += item;
        }
        


        return answer;
    }
}