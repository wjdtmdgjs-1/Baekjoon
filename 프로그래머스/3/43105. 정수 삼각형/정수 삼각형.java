class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length; // 삼각형 높이 & 밑변
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }    
        }
        return triangle[0][0];
    }
}