class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = hp / 5;
        int b = hp % 5;
        int c=0;
        int d =0;
        if(b!=0){
            c = b/3;
            d = b%3;
        }
        answer = a + c + d;
        return answer;
    }
}