class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                 even++;   
            } else {
            odd++;
            }
        }
        return new int[]{even, odd};
    }
}