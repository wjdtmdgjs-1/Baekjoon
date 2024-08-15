class Solution {
    public boolean solution(int x) {    
        boolean answer = true;
        int a=0;
        int b=0;
        int y=x;
        while(true){
            a=x%10;
            b+=a;
            x=x/10;
            if(x/10==0){
                b+=x;
                break;
            }            
        }
        if(y%b==0){
            answer = true;
            System.out.print(b);
        }else {
            answer = false;      
            System.out.print(b);
        }
        
        return answer;
    }
}