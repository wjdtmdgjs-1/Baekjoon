import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int total = brown / 2 + 2;
        List<Integer> carpetList = new ArrayList<>();
        
        for(int i = total-3; i > 1; i--) {
            if( i >= total - i) {
                carpetList.add(i);
            }
        }
        
        for(int i = 0; i < carpetList.size(); i++) {
            int yelloSize = (carpetList.get(i)-2) * (total - carpetList.get(i) - 2);
            if(yellow == yelloSize) {
                answer[0] = carpetList.get(i);
                answer[1] = total - carpetList.get(i);
                break;
            }
        }
        
        return answer;
    }
}