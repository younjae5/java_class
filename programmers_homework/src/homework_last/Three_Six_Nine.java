package homework_last;
import java.util.Arrays;

public class Three_Six_Nine {

  class Solution {
      public int solution(int n) {
          int answer = 0;
          String s = Integer.toString(n);
          String arr[] = s.split("");
          int len = arr.length;
          
          for(int i = 0; i < len; i++){
              if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
                  answer++;
              }
          }
          return answer;
      }
    }
}
