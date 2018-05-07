
public class Operator {
	
	public static void main(String[] args) {
		
		
    
		
//2018.3.15 lab
	int v1 = 5;
	int v2 = 2;
	
	int result4 = v1 /v2;
	System.out.println("result4 = "+ result4);
	int result5 = v1 % v2;
	System.out.println("result5 = " + result5);
	double result6 = (double) v1 / v2;
	System.out.println("result6 = " + result6);
	
	int addAssign = 10;
	addAssign += 20;
	System.out.println("add and assign value is" + addAssign);
	addAssign = addAssign + 20;
	
	
	
	int overflow1 = 2000000000;
	int overflow2 = 2000000000;
	long overflowResult = overflow1 + overflow2;
	System.out.println("overflow output is " + overflowResult);
	
	long overflow3 = 2000000000L;
	long noOverflow = overflow1 + overflow3;
	System.out.println("no overflow output is: " + noOverflow);
	System.out.println("int value is " + (overflow1 / 100000)+
			" double value is:" + (overflow1/100000.0));
	
	int errorX = 5;
	double errorY = 0.0;
	double errorResult = errorX / errorY;
	//double errorResult = erroX % errorY;
	
	System.out.println(Double.isInfinite(errorResult));
	System.out.println(Double.isNaN(errorResult));
    
	
	
	
	
	String s1 = "Hello";
	String s2 = " Java";
	String s3 = "!!";
	String out = s1 + s2 + s3;
	System.out.println(out);
	
    //Compare operator
	int num1 = 10;
	int num2 = 10;
	boolean compareEq = (num1 == num2);
	boolean compareNotEq = (num1 != num2);
	boolean compareLessThan = (num1 <= num2);
	System.out.println("compareEq = " + compareEq);
	System.out.println("compareNotEq = " + compareNotEq);
    System.out.println("compareLessThan = "+ compareLessThan);
    
    boolean output = 2 * 3 > 4 + 5 && 6 / 3 == 2 || !false;
    System.out.println(output);
    
    int compareInt = 1;
    double compareDouble = 1.0;
    //What will the result be?
    System.out.println(compareInt == compareDouble);
	
    
    
    
    
    
    
    
    
    int charCode = 'A';
    if ((charCode >= 65) && (charCode <= 90)) {
    	System.out.println("Capital");
    }
    int value = 8;
    if ((value % 2 == 0) || (value % 3 == 0)){
    	System.out.println("Multiplication of two or three");
    	
    }
    
    
    
    
    
    
    
	
	
	}
}
