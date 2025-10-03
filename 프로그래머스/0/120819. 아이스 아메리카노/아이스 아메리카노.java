class Solution {
    public int[] solution(int money) {
        int americano = money / 5500;
        int change = money % 5500;
        return new int[]{americano, change};
    }
}