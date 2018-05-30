package homework_last;

public class Count_Alphabet {
  class Solution {
    public int solution(String str) {
        int answer = 0;
        int len = str.length();
        
        for(int i = 0; i < len; i++){
            if( (65 <= str.charAt(i) && 90 >= str.charAt(i)) || (97<=str.charAt(i) && 122 >= str.charAt(i))){
                answer++;
            }
        }
        return answer;
    }
}

}
