import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {                
        List<Integer> a = new ArrayList<>();        
        
        for(int i=0; i<arr.length;i++){
            if(arr[i] % divisor == 0){
                a.add(arr[i]);
            }            
        }        
        
        if(a.size()==0){
            a.add(-1);
        }        
        
        int[] answer = new int[a.size()];
        
        for(int i=0;i<a.size();i++){
            answer[i]=a.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}