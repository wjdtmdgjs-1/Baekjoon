import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int[] count = new int[7];

        count[a]++; count[b]++; count[c]++;

        int answer = 1;

        int max = Arrays.stream(count).max().orElseThrow();

        for (int i = 1; i <= max; i++){
            answer *= (int) Math.pow(a, i) + (int) Math.pow(b, i) + (int) Math.pow(c, i);
        }

        return answer;
    }
}