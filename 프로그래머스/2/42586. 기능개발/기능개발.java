import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 작업이 완료되기까지 남은 날짜를 저장할 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        // 배포 단위를 저장할 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        // 반복문을 활용하여 progresses와 speeds 배열 순회
        for (int i = 0; i < progresses.length; i++) {
            // 만약 나머지가 0인 경우
            if ((100 - progresses[i]) % speeds[i] == 0) {
                // 그대로 나누고 queue에 계산한 결과 저장
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                // queue에 계산한 결과에 +1 후 저장
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        
        // queue에서 꺼낸 값 num에 저장
        int num = queue.poll();
        // 횟수를 저장할 count 변수 생성
        int count = 1;
        
        // queue가 비어있을 때까지 반복
        while (!queue.isEmpty()) {
            // 만약 queue의 최상위 값이 num보다 작거나 같은 경우
            if (num >= queue.peek()) {
                // count +1
                count++;
                // queue 최상위 값 꺼내기
                queue.poll();
            } else {
                // 현재 count를 list에 저장
                list.add(count);
                // count를 1로 초기화
                count = 1;
                // num에 queue 최상위 값 꺼내기
                num = queue.poll();
            }
        }
        // list에 count값 저장
        list.add(count);
        
        // answer 배열 생성
        int[] answer = new int[list.size()];
        
        // 반복문을 활용하여 answer 순회
        for (int i = 0; i < answer.length; i++) {
            // answer에 list 값 저장
            answer[i] = list.get(i);
        }
        
        // answer 반환
        return answer;
    }
}