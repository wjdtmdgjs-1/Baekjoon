class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(eq.equals("=")){
            if(ineq.equals("<") && (n <= m)){
                answer = 1;
            }else if(ineq.equals(">") && (n >= m)){
                answer = 1;
            }else{
                answer = 0;
            }
        }else if(eq.equals("!")){
            if(ineq.equals("<")&&n<m){
                answer = 1;
            }else if(ineq.equals(">")&&n>m){
                answer = 1;
            }else{
                answer = 0;
            }
        }
        
        return answer;
    }
}