import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // 의상 종류와 종류별 개수를 저장하기 위한 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        // 반복문을 활용하여 clothes 배열 순회
        for (String[] s : clothes) {
            // map의 Key에 의상 종류, Value에 종류별 개수를 저장
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }
        
        // 반복문을 활용하여 map의 KeySet 순회
        for (String s : map.keySet()) {
            // map의 Value 값에 +1 해서 answer에 곱하기
            // 착용하지 않을 경우도 포함하여 +1
            answer *= (map.get(s) + 1);
        }
        // 모두 착용하지 않는 것은 불가능하므로 -1
        answer--;
        
        // answer 반환
        return answer;
    }
}