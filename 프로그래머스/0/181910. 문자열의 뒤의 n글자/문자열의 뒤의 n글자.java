class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int a = my_string.length();
        
        for(int i = a-n; i<a;i++){
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}