class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i=2;i<common.length;i++){
            if(common[i]-common[i-1]==common[i-1]-common[i-2]){
                answer=common[common.length-1]+common[i]-common[i-1];
            }else{
                answer=common[common.length-1]*(common[i]/common[i-1]);
            }
        }
        return answer;
    }
}