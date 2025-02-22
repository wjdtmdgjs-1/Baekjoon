import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {

        int copyarr[] = new int[arr.length];
        int count = 0;
        int result = 0;

      while(true){

          copyarr = arr.clone(); 
          ++count;

          for(int i = 0; i < arr.length; ++i){

              if(arr[i] >= 50 && (arr[i]%2 == 0)){ 
                arr[i] = arr[i] / 2; 
            }
            else if(arr[i] < 50 && (arr[i]%2 == 1)){  
                arr[i] = 2*arr[i] + 1; 
            }

        } 

          if(Arrays.equals(copyarr, arr)){
             result = count - 1;
             break;
          }

      } 

        return result;

    }
}