class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a=sides[0];
        int b=sides[1];
        int c=sides[2];
        int big =0;
        if(a>=b && a>=c){
            big=a;
        }else if(b>=c){
            big=b;
        }else {
            big=c;
        }
        if(big<a+b+c-big){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}