import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(list.size() == k){
                break;
            }
            else if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        while(list.size() != k){
            list.add(-1);
        }
        return list.stream().mapToInt(j -> j).toArray();
    }
}