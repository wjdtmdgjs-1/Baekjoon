class Solution {
public int solution(String my_string) {
int answer = 0;

for (int i = 0; i < my_string.length(); i++){

        // 1부터 9까지의 아스키 코드는 49 ~ 57까지
        if(my_string.charAt(i) == 49){
            answer += 1;
        }else if (my_string.charAt(i) == 50){
            answer += 2;
        }else if (my_string.charAt(i) == 51){
            answer += 3;
        }else if (my_string.charAt(i) == 52){
            answer += 4;
        }else if (my_string.charAt(i) == 53){
            answer += 5;
        }else if (my_string.charAt(i) == 54){
            answer += 6;
        }else if (my_string.charAt(i) == 55){
            answer += 7;
        }else if (my_string.charAt(i) == 56){
            answer += 8;
        }else if (my_string.charAt(i) == 57){
            answer += 9;
        }    
    } 
    return answer;
}
}