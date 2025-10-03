class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
        
        // 또 다른 풀이
        // return Arrays.stream(strlist)
        //              .mapToInt(String::length)
        //              .toArray();
    }
}