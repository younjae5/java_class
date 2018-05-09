package programmers_homework;

public class PlainText {
  class Solution {
    public int[] solution(String plaintext) {
        int len = plaintext.length();
       // char[len] the_string = {};
        int[] answer = {};
        answer = new int[len];
     /*   for(int i = 0; i < len; i++){
            the_string[i] = plaintext.charAt(i);
        }
        
        */
        for(int i = 0; i < len; i++){
            answer[i] = (int)plaintext.charAt(i);
        }
        return answer;
    }
}

}
