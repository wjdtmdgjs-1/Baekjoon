class Solution {
    public int solution(int chicken) {
        
        int result = 0;
        int coupon = chicken;
        while(coupon >= 10) {
            int survice = coupon / 10; // 108
            result += survice;
            coupon = survice + (coupon % 10); // 108 + 1
            
        }
        return result;
    }
}