import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Integer[] newArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        int answer = 0;
        Arrays.sort(newArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(newArray));
        return newArray[0] * newArray[1];
    }
}