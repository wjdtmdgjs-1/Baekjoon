import java.util.ArrayList;


class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        my_string += " ";
        String temp_string = "";

        for (int i = 0; i < my_string.length(); i++){
            char chr = my_string.charAt(i);
            if (chr != ' '){
                temp_string += chr;
            } else if (!temp_string.isEmpty()){
                answer.add(temp_string);
                temp_string = "";
            }
        }

        return answer.toArray(String[]::new);
    }
}