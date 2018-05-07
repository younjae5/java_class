import java.util.*;

public class Arithmetic_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double pv;
		int pmt, i, n;
		pmt = sc.nextInt();
		i = sc.nextInt();
		n = sc.nextInt();
		pv = pmt * (((Math.pow(1 + i, n - 1) - 1) / i) / Math.pow(1 + i, n - 1) + 1);
		System.out.println(pv);
	}
}

