class Solution {
    public int[] solution(int money) {
        int americano = money / 5500;
        int change = money % 5500;
        return new int[]{americano, change};
        // 아래처럼 줄여서 쓸 수 있다!
        // return new int[] { money / 5500, money % 5500 };
    }
}
