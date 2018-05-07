public class string_programming 
{   
   public static void main(String[] args) 
   {
      String inputString = "The quick brown fox jumps over the lazy dog";
      String outputString = new String("");    
      outputString = outputString.concat(inputString.substring(0, 1)).concat(inputString.substring(2, 3)).concat(inputString.substring(22, 24)).concat(inputString.substring(5, 6)).concat(inputString.substring(24, 26)).concat(inputString.substring(16, 17)).concat(inputString.substring(21, 22)).concat(inputString.substring(42, 43)).concat(inputString.substring(6, 7)).concat(inputString.substring(0, 1).toLowerCase());
      
      System.out.println(outputString);

   }
}