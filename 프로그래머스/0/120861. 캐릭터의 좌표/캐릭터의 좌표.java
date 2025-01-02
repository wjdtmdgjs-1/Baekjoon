class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 최종 좌표가 들어갈 변수 answer
        int[] answer = {0,0};
        int col = ( (board[0]-1) / 2);
        int row = ( (board[1]-1) / 2);

        // board는 [x,y]의 형태로 주어짐, 길이2 최대인덱스 1
        // board에 주어진 좌표는 0,0을 제외하고 상하좌우 균등분배를 해 주어야 한다.
        // 배열 내 인덱스 데이터는 음수가 가능하지만 인덱스는 음수여선 안된다.
        // 시작점은 0,0부터 시작. (board의 값에 -1씩 해줘야한다 유추가능.)
        // 균등분배 후 이동좌표를 초과하면 최대좌표를 리턴한다.
        for(int i = 0; i <keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    answer[0] = answer[0]-1;
                    break;
                case "right":
                    answer[0] = answer[0]+1;
                    break;
                case "up":
                    answer[1] = answer[1]+1;
                    break;
                case "down":
                    answer[1] = answer[1]-1;
            }
          if(Math.abs(answer[0]) > Math.abs(col)){
              if(answer[0] < 0 ){
                  answer[0] = answer[0] + 1;
              } else {
                  answer[0] = answer[0] - 1;
              }
          } else if (Math.abs(answer[1]) > Math.abs(row)){
              if(answer[1] < 0 ){
                  answer[1] = answer[1] + 1;
              } else {
                  answer[1] = answer[1] - 1;
              }
          }
        }
        return answer;
    }
}