class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char [] x = control.toCharArray();
        for(int i=0; i<control.length(); i++){
            if(x[i]=='w'){
                n+=1;
            } else if(x[i]=='s'){
                n-=1;
            } else if(x[i]=='d'){
                n+=10;
            } else if(x[i]=='a'){
                n-=10;
            }
        }
        answer=n;
        return answer;
    }
}