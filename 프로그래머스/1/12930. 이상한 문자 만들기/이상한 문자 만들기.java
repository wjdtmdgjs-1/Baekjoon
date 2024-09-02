import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);  // 단어를 공백을 기준으로 분리
        
        for(int i = 0; i < words.length; i++){
            StringBuilder word = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                char c = words[i].charAt(j);
                if(j % 2 == 0){
                    word.append(Character.toUpperCase(c));  // 짝수 인덱스 대문자
                } else {
                    word.append(Character.toLowerCase(c));  // 홀수 인덱스 소문자
                }
            }
            answer.append(word);  // 변환된 단어를 결과에 추가
            if (i < words.length - 1) {
                answer.append(" ");  // 단어 사이에 공백 추가
            }
        }
        
        return answer.toString();
    }
}
