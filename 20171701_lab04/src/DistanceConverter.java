public class DistanceConverter 
{ 
    public static void main(String args[]) 
    { 
       double yards = 3.5; 
       double feet = yards * 3; 
       double inches = feet * 12; 
       System.out.printf("%.1f yards are %.1f feet.\n", yards, feet);
       System.out.printf("%.1f yards are %.0f inches.", yards, inches);
    }
} 
