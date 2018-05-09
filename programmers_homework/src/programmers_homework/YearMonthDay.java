package programmers_homework;

public class YearMonthDay {
  class Solution {
    public String solution(int year, int month, int day) {
        String answer = "";
        String new_year = Integer.toString(year);
        String new_month = Integer.toString(month);
        String new_day = Integer.toString(day);
        
        answer = answer + new_year + "-";
        if(new_month.length() < 2){
            new_month = "0" + new_month;
            answer = answer + new_month + "-";
        }else{
            answer = answer + new_month + "-";
        }
        
        if(new_day.length() < 2){
            new_day = "0" + new_day;
            answer += new_day;
        }else{
            answer += new_day;
        }
        return answer;
    }
}

}
