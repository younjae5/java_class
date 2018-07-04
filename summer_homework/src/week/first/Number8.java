package week.first;
/*
 * 함수의 인자값으로 문자열 str1과 str2가 주어진다.
 * str1과 str2를 비교하여, 같으면 true를 다르면 false를 리턴하는 함수를 구현하시오. 
 * String.equals() 함수 사용 금지. 코드 검사 후 적발시 0점 처리됨.*/
public class Number8 {
    class Solution {
        public boolean solution(String str1, String str2) {
            boolean answer = true;
            int len = str1.length();
            if(len != str2.length()){
                answer = false;
            }
            for(int i = 0; i < len; i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    answer = false;
                }
            }
            return answer;
        }
    }

}
