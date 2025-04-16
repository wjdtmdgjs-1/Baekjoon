import java.util.Arrays;
 
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과를 저장할 배열
        
        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            // array의 i번째부터 j번째까지 자르기
            int[] slicedArray = Arrays.copyOfRange(array, i - 1, j);
            
            // 자른 배열 정렬
            Arrays.sort(slicedArray);
            
            // 정렬된 배열의 k번째 값 찾기
            answer[c] = slicedArray[k - 1];
        }
        
        return answer;
    }
}