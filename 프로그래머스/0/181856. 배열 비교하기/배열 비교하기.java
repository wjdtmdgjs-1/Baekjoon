class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum = 0;
        int arr2Sum = 0;
        
        for(int i=0;i<arr1.length;i++){
            arr1Sum += arr1[i];
        }
        
        for(int j=0;j<arr2.length;j++){
            arr2Sum += arr2[j];
        }
        
        if(arr1.length == arr2.length){
            if(arr1Sum > arr2Sum){
                answer = 1;
            }else if(arr1Sum < arr2Sum){
                answer = -1;
            }else{
                answer = 0;
            }
        }else{
            return arr1.length > arr2.length ? 1 : -1;
        }
        
        return answer;
    }
}