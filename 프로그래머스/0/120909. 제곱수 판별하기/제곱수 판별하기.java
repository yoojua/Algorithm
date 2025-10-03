class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n); // 제곱근 구하기
        return (sqrt * sqrt == n) ? 1 : 2;
    }
}