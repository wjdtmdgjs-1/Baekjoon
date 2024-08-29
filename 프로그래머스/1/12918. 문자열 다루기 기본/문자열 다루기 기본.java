import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        
        b.add("0");b.add("1");b.add("2");b.add("3");b.add("4");b.add("5");
        b.add("6");b.add("7");b.add("8");b.add("9");
        
        a = Arrays.asList(s.split(""));
        //123a
        if(a.size()==4||a.size()==6){
            for(String bb: a){
                answer=false;
                for(String cc :b){
                    if(bb.equals(cc)){
                        answer = true;
                        break;
                    }
                }
                System.out.println(answer);
                if(answer == false){
                    break;
                }
                
            }
        }
        System.out.println(answer);
        return answer;
    }
}