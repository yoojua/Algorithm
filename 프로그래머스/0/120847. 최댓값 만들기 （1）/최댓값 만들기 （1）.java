import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순
        int n = numbers.length;
        
        return numbers[n - 1] * numbers[n - 2];
    }
}