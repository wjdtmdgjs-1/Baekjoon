import java.util.*;
class Solution {
    public int[] solution(int[] arr) {        
        int min=100000;
        int a=0;
        int b=0;
        List<Integer> aa = new ArrayList<>();
        
        if(arr.length==1){
            b=1;            
        }
        
        for(int i =0; i<arr.length;i++){
            aa.add(arr[i]);
            if(min>arr[i]){
                min=arr[i];
                a=i;
            }
        }
        if(b==1){
            aa.add(-1);
            aa.remove(a);
        }else{
            aa.remove(a);
        }
                      
        int[] answer = aa.stream()
            .mapToInt(Integer::intValue)
    	    .toArray();
        
        return answer;
    }
}