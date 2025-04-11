import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 참가자의 이름을 Key로, 이름의 개수를 Value로 저장
        HashMap<String, Integer> map = new HashMap<>();
        
        // 반복문을 활용하여 participant 배열을 순회
        for (String p : participant) {
            // 각 참가자의 이름을 HashMap에 저장
            // getOrDefault 메서드를 활용하여 이미 HashMap에 존재하는 이름이라면 값을 증가
            // 존재하지 않으면 기본값을 0으로 설정하고 +1
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 반복문을 활용하여 completion 배열을 순회
        for (String c : completion) {
            // 각 완주자의 이름의 Value -1
            map.put(c, map.get(c) -1);
        }
        
        // 반복문을 활용하여 HashMap을 순회
        for (String key : map.keySet()) {
            // 만약 Value 값이 0이 아닌 key(참가자 이름)이 있는 경우
            if (map.get(key) != 0) {
                // answer에 Key 값 저장
                answer = key;
            }
        }
        
        // answer 반환
        return answer;
    }
}