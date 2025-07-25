class Solution {
    public String solution(String my_string, int n) {
        String str = "";
        for(int i = 0 ; i < my_string.length() ; i++){
            for(int j = 0 ; j < n ; j++){
               str += my_string.charAt(i);
            }
        }
        return str;
    }
}