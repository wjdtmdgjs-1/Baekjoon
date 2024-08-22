import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        String[] a = phone_number.split("");
        list.addAll(Arrays.asList(a));
        
        for(int i=0;i<list.size();i++){
            
            if(i<list.size()-4){
                list2.add("*");                
            }else{
                list2.add(list.get(i));
            }
        }
        answer = String.join("",list2);

        return answer;
    }
}