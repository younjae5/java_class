package programmers_homework;

public class Palindrome {
  class Solution {
    public boolean solution(String str) {
        boolean answer = true;
        String str1 = str;
        String str2 = "";
        for(int i = (str.length() - 1); i >= 0; i--){
            str2 += str1.charAt(i);
        }
        for(int i = 0; i < str.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                answer = false;
                break;
            }else{
                answer = true;
            }
        }
        return answer;
    }
}

}
