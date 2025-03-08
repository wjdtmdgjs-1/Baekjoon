import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 1, 2, 3의 정답 패턴 입력
        int[] first = {1, 2, 3, 4, 5};  // 5개의 숫자 반복
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};  // 8개의 숫자 반복
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};  // 10개의 숫자 반복
        
        // 수포자들의 점수를 저장할 배열 생성
        int[] score = {0, 0, 0};
        
        // 반복문을 통해 각 수포자들의 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) {
                score[0]++;
            }
            if (answers[i] == second[i%8]) {
                score[1]++;
            }
            if (answers[i] == third[i%10]) {
                score[2]++;
            }
        }
        
        // 최대 점수 계산
        int max_score = score[0];
        for (int i = 1; i <= 2; i++) {
            if (max_score < score[i]) {
                max_score = score[i];
            }
        }
        
        // 최대 점수를 획득한 수포자들 저장
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
            if (max_score == score[i]) {
                temp.add(i+1);
            }
        }
        
        // 저장한 수포자들 answer에 입력
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        // answer 반환
        return answer;
    }
}