import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // Key 값과 횟수인 Value를 저장할 HashMap 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 반복문을 활용하여 nums 배열 순회
        for (int n : nums) {
            // n을 Key 값으로 넣고 Value에 횟수 계산
            // 중복된 값이라면 Value +1
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        // length에 nums의 절반 길이 저장
        int length = nums.length / 2;
        
        // 만약 map의 길이가 length보다 크거나 같은 경우
        if (map.size() >= length) {
            // answer에 length 값 저장
            answer = length;
        } else {
            // 그렇지 않다면 map의 길이 저장
            answer = map.size();    
        }
        
        // answer 반환
        return answer;
    }
}