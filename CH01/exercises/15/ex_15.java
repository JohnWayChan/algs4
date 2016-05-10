import edu.princeton.cs.algs4.StdOut;

public class ex_15{

	public static  String  exR1(int n){
		if (n <= 0) {
			return "";
		}
		return exR1(n -3) + n + exR1(n-2) + n;
	}	



	public static void main(String[] args){
		int N =  Integer.parseInt(args[0]);
		String  result = exR1(N);

		StdOut.println(result);

	}

}