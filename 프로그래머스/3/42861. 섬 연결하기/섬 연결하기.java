import java.util.*;

class Solution {
    
    class Bridge implements Comparable<Bridge> {
        int src, dest, cost;
        
        public Bridge(int src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Bridge b) {
            if(this.cost == b.cost) {
                return this.src - b.src;
            }
            return this.cost - b.cost;
        }
    }
    int[] parents;
    
    public int findParent(int n) {
        if (parents[n] != n) {
            parents[n] = findParent(parents[n]);
        }
        return parents[n];
    }
    
    public void union(int a, int b){
        a = findParent(a);
        b = findParent(b);
        
        if (a < b) {
            parents[b] = a;
        } else {
            parents[a] = b;
        }
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int len = costs.length;
        List<Bridge> bridges = new ArrayList<>();
        
        for(int i = 0; i < len; i++){
            Bridge newBridge = new Bridge(costs[i][0], costs[i][1], costs[i][2]);
            bridges.add(newBridge);
        }
        Collections.sort(bridges);
        parents = new int[n+1];
        for(int i = 0; i <= n; i++) {
            parents[i] = i;
        }
        
        for(Bridge bridge: bridges) {
            if (findParent(bridge.src) != findParent(bridge.dest)) {
                union(bridge.src, bridge.dest);
                answer += bridge.cost;
            }
        }
        
        return answer;
    }
}