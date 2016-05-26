import edu.princeton.cs.algs4.StdOut;
import java.lang.Math;

public class ex_20{



	public static int factorial(int n){

		if(n == 1){ 
			return 1;
		}

		return n*factorial(n-1);

	}

	public static double ln_fac(int n){
		 int N = factorial(n);
		double result = Math.log(N);

		return result;


	}


	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		//long a = factorial(n);
		double result = ln_fac(n);
		StdOut.println(result);

	}
}