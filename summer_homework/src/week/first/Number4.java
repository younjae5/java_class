package week.first;

/*
    3 6 9 게임을 하던 경곽이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
    3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
*/

public class Number4 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String sen = Integer.toString(n);
            int len = sen.length();
            for(int i = 0; i < len; i++){
                if(sen.charAt(i) == '3' || sen.charAt(i) == '6' || sen.charAt(i) == '9'){
                    answer += 1;
                }
            }
            return answer;
        }
    }

}
