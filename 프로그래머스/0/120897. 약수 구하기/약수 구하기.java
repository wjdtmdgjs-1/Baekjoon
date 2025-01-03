import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
       List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                if(!list.contains(i))
                     list.add(i);
                if(!list.contains(n/i))
                    list.add(n/i); 
            }
            }

        return list.stream()
            .sorted()
            .mapToInt(a -> a.intValue())
            .toArray();
    }
}