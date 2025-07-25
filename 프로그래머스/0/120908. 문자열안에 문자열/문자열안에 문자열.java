import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String[] ans1 = str1.split("");
        String[] ans2 = str2.split("");
        for(int i = 0 ; i <= ans1.length-ans2.length ; i++){
            if(ans1[i].equals(ans2[0])){
                int a =0;
                for(int j = 0 ; j < ans2.length ; j++){
                    if(ans1[i+j].equals(ans2[j])){
                        a++;
                    }
                    if(a==ans2.length){
                        answer = 1;
                    }
                }
            }
        }
        return answer;
    }
}