import java.util.*;

// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************

public class BaseConvert
{
   public static void main(String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1¡¯s place
      int place1;      // digit in the base place
      int place2;      // digit in the base*base place
      int place3;      // digit in the base*base*base place

      String baseBNum = new String(""); // the number in the new base

      // read in the base 10 number and the base
	  Scanner in = new Scanner(System.in);
      System.out.println();
      System.out.println("Base Conversion Program");
      System.out.println();
      System.out.print("Please enter a base (2 - 9): ");
      base = in.nextInt();

      // Compute the maximum base 10 number that will fit in 4 digits 
      // in the new base and tell the user what range the number they
      // want to convert must be in

      System.out.print("Please enter a base 10 number to convert: ");
      base10Num = in.nextInt();
    
      maxNumber = (int) (Math.pow(base, 4)) - 1;
      System.out.printf("The Maximum number is %d\n", maxNumber);
      // Do the conversion (see notes in lab)
      place0 = base10Num % base;
      base10Num /= base;
      place1 = base10Num % base;
      base10Num /= base;
      place2 = base10Num % base;
      base10Num /= base;
      place3 = base10Num % base;
      base10Num /= base;     
      
      // Print the result (see notes in lab)
      baseBNum = baseBNum.concat(String.valueOf(place3)).concat(String.valueOf(place2)).concat(String.valueOf(place1)).concat(String.valueOf(place0));
      System.out.println(baseBNum);
      in.close();
    }
}

