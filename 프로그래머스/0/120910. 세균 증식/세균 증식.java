class Solution {
    public int solution(int n, int t) {
        int num = 1;
        for(int i =0; i<t;i++){
            num=num*2;
        }
        int answer = n*num;
        return answer;
    }
}