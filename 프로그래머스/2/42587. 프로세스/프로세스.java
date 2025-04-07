import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<int[]> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선 순위(내림차순)

        for(int i =0; i<priorities.length; i++){
            q.offer(new int[]{priorities[i],i}); // 각 원소의 위치와 함께 큐에 삽입
            pq.add(priorities[i]); // 우선순위큐에 원소 삽입
        }

        while(true){
            int[] p = q.poll(); // 큐에 있는 첫번째 원소를 꺼내서

            if(p[0] < pq.peek()){ // 우선순위큐 값보다 작다면 
                q.offer(new int[]{p[0],p[1]}); // 다시 꺼낸 그대로 큐에 삽입
            }
            else{ // 우선순위보다 크거나 같다면
                answer++; // 실행 횟수 카운트
                if(p[1] == location) break; // 꺼낸 원소의 위치와 location 위치가 같다면 종료 
                pq.poll(); 
            }
        }

        return answer;
    }
}