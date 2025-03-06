class Solution {
    public int solution(int[][] board, int k) {
        int result = 0; // 결과를 저장할 변수 초기화
        
        // 2중 for문을 통해 2차원 배열의 모든 요소를 탐색
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 인덱스의 합 (i + j)이 k 이하일 때만 해당 요소의 값을 결과에 더함
                if (i + j <= k) {
                    result += board[i][j];
                }
            }
        }
        
        return result;
    }
}
