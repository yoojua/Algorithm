class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        
        for (String a : s1) {
            for (String b : s2) {
                if (a.equals(b)) {
                    count++;
                }
            }
        }
        return count;
    }
}