// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int terms = Integer.parseInt(args[0]);

		double piApprox = 1.0;
		for (int k = 1; k < terms; k++) {
			piApprox += Math.pow(-1, k) / (2 * k + 1);
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (piApprox * 4));
	}
}
