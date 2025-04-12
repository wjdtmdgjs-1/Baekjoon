import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // phone_book 배열 오름차순 정렬
         Arrays.sort(phone_book);

        // 반복문을 활용하여 phone_book 배열 순회
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 만약 다음 값이 현재 값으로 시작한다면
            if (phone_book[i+1].startsWith(phone_book[i])) {
                // answer에 false 저장
                answer = false;
                // 반복문 종료
                break;
            }
        }
        
        // answer 반환
        return answer;
    }
}