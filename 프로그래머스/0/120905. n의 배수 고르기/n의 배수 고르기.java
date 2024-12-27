class Solution {
    public int[] solution(int n, int[] numlist) {

        //배열 answer의 길이
        int a = 0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                a++;
            }
        }

        //n의 배수 고르고, 배열 answer에 추가
        int[] answer = new int[a];
        int k = 0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[k] = numlist[i];
                k++;
            }
        }
        return answer;
    }
}