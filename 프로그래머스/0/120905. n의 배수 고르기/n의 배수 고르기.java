import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }
        
        // ArrayList -> int[] 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
        
        // 방법 2. Stream
        // return Arrays.stream(numlist)
        //              .filter(num -> num % n == 0)
        //              .toArray();
    }
}