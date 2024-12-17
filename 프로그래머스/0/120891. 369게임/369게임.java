class Solution {
    public int solution(int order) {
        int result = 0; // 3, 6, 9의 개수를 저장할 변수

        // order를 문자열로 변환하고, 각 문자에 대해 반복
        for (char c : String.valueOf(order).toCharArray()) {
            // 각 문자가 '3', '6', '9' 중 하나인지 확인
            if (c == '3' || c == '6' || c == '9') {
                result++; // 3, 6, 9일 경우 카운트를 증가
            }
        }
        return result; // 최종 카운트 반환
    }
}
