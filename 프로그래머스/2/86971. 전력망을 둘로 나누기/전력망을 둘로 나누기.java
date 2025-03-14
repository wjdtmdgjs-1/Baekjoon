import java.util.*;
class Solution {
    public int[] parent;
    
    public void init(int n) {
        for(int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }
    
    public int findParent(int n) {
        if (parent[n] != n) {
            parent[n] = findParent(parent[n]);
        }
        return parent[n];
    }
    
    public void union(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int len = wires.length;
        for(int i = 0; i < len; i++) {
            // i는 끊는
            parent = new int[n+1];
            init(n);
            
            for(int j = 0; j < len; j++) {
                if(i == j) {
                    continue;
                }
                if(findParent(wires[j][0]) != findParent(wires[j][1])) {
                    union(wires[j][0], wires[j][1]);
                }
            }
            
            // 각 송전탑의 최상위 부모 노드 갱신 및 개수 세기
            Map<Integer, Integer> connect = new HashMap<>();
            for (int j = 1; j <= n; j++) {
                int root = findParent(j);
                connect.put(root, connect.getOrDefault(root, 0) + 1);
            }
            
            // 두 개의 그룹으로 나뉘었는지 확인하고 차이 계산
            if (connect.size() == 2) {
                List<Integer> counts = new ArrayList<>(connect.values());
                int diff = Math.abs(counts.get(0) - counts.get(1));
                answer = Math.min(answer, diff);
            }
            
        }
        return answer;
    }
}