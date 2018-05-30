package homework_last;

public class Three_Six_Nine {
  class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}

  /*class Solution {
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
    }*/
}
