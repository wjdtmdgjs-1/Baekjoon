class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for(int i =0; i<=n;i++){
            if(i%2!=0&&i<=n){
                answer[i/2]=i;
            }
        }
        return answer;
    }
}