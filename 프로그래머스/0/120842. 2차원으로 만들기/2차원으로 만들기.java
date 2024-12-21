class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 결과 배열을 선언합니다. num_list의 길이를 n으로 나눈 값을 행의 수로, n을 열의 수로 설정합니다.
        int[][] result = new int[num_list.length / n][n];
        
        // num_list 배열을 순회하면서 2차원 배열에 값을 채웁니다.
        for (int i = 0; i < num_list.length; i++) {
            // i를 n으로 나눈 값이 행의 인덱스가 되고, 나머지 값이 열의 인덱스가 됩니다.
            result[i / n][i % n] = num_list[i];
        }
        
        return result;
    }
}
