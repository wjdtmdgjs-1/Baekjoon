import java.util.*;

class Solution {
    public long solution(long n) {
        
        long answer = 0;
        
        //.split("") = 한글자씩 넣기
        //String.valueOf() = 정수를 문자열로
        //배열로 넣기(Arrays.sort 사용하기 위해)
        String[] aa = String.valueOf(n).split("");
        
        //Arrays.sort('배열이름', Collections.reverseOrder())  =  배열을 역차순으로 배열
        
        Arrays.sort(aa, Collections.reverseOrder());
        
        String str = "";
        for (String item : aa) {
            str += item;
        }
        
        answer = Long.parseLong(str);
             
        return answer;
    }
}