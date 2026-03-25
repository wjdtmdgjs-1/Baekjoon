class Solution {
    boolean solution(String s) {
        boolean answer = true;
        StringBuilder result = new StringBuilder();
        int num = 0;
        int num2 = 0;
        for(char c : s.toCharArray()){
            if((c == 'y') || (c == 'Y')){
                num++;
            }else if((c == 'p') || (c == 'P')){
                num2++;
            }
        }
        if(num == num2){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}