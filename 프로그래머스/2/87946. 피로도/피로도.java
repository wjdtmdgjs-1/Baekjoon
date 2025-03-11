import java.util.*;

class Solution {
    boolean[] visited = new boolean[9];
    List<Integer> list = new ArrayList<>();
    int ans = 0, K = -1;
    int[][] pDungeons;
    
    public void find(int cur, int size) {
        if (cur == size) {
            int pirodo = K, stage = 0;
            for(int num: list) {
                if (pirodo >= pDungeons[num][0]) {
                    pirodo -= pDungeons[num][1];
                    stage++;
                }
            }
            
            ans = Math.max(ans, stage);
            return;
        }
        
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;
            list.add(i);
            visited[i] = true;
            
            find(cur + 1, size);
            
            visited[i] = false;
            list.remove(list.size() -1);   
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        pDungeons = new int[n][2];
        for(int i = 0; i < n; i++) {
            pDungeons[i][0] = dungeons[i][0];
            pDungeons[i][1] = dungeons[i][1];
        }
        K = k;
        
        find(0, n);
        
        return ans;
    }
}