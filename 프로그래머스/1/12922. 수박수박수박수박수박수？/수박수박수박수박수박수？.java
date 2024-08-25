import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";        
        List<String> aa = new ArrayList<>();
                
        for(int i=0; i<n;i++){
            if(i%2==0){
                aa.add("수");
            }else{
                aa.add("박");
            }
        }
        
        for(String a : aa){
            answer += a;
        }
        
        
        return answer;
    }
}