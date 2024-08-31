import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int a =0;
        int b=0;
        List<Integer> list = new ArrayList<>();
        while(true){
            if(n==0){
                break;
            }
            a=n%3;
            n=n/3;
            list.add(a);
        }
        for(int i=list.size()-1; 0<=i ; i--){
            answer+= list.get(i)*Math.pow(3,b);
            b++;
        }
        return answer;
    }
}