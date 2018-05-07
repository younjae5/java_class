public class MilkJarCalculator 
{ 
    public static void main(String args[]) 
    { 
       double milk = 5.5; // liters 
       double jarCapacity = 0.75; // liters
       int completelyFilledJars = (int)(milk / jarCapacity); 
       System.out.println(completelyFilledJars); 
   } 
} 
