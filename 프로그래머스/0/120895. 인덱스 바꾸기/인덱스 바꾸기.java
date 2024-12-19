import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        // 1. 문자열을 문자 배열로 변환합니다.
        String[] strArr = my_string.split("");
        
        // 2. 배열 내에서 두 문자의 위치를 교환합니다.
        String tmpStr = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = tmpStr;
        
        // 3. 문자 배열을 다시 문자열로 결합하여 반환합니다.
        return String.join("", strArr);
    }
}
