class Solution {
    public int[] solution(int n, int m) {
        
        int big = 0;
        int small =0;
        if(n<=m){
            big=m;
            small=n;
        }else{
            big=n;
            small=m;
        }
        int min=1;
        int max=1;
        for(int i=1;i<=small;i++){
            if(small%i==0&&big%i==0){
                min=i;
            }
        }
        for(int i=big;i<=big*small ;i++){
            if(i%small==0&&i%big==0){
                max=i;
                break;
            }
        }
        int[] answer={min,max};
        return answer;
    }
}