class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int b=1;
        int a=0;
        for(int i=0;i<num_list.length;i++){
            answer=answer+num_list[i];
            b=b*num_list[i];
        }
        
        if((answer*answer)>=b){
            a=1;
        }else{
            a=0;
        }
       
        return a;
    }
}