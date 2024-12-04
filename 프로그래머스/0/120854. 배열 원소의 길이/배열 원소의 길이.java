class Solution {
    public int[] solution(String[] strlist) {

        int x = strlist.length;
        int[] y = new int[x];
        int z = 0;

        for(int i = 0; i<x; i++) {
            y[i] = strlist[i].length();
        }

        int[] answer = {z};
        return y;
    }
}