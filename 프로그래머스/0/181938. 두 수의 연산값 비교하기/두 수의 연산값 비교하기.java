class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = Integer.toString(a) + Integer.toString(b);
        
        int e = Integer.parseInt(s);
        int f = a * 2 * b;
        if(e>=f){
            answer = e;
        }else{
            answer = f;
        }
        return answer;
    }
}