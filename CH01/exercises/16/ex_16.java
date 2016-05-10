import edu.princeton.cs.algs4.StdOut;

public class ex_16{

	public static  String  exR1(int n){

		if (n <= 0) {
			return "";
		}
		String s = exR1(n -3) + n + exR1(n-2) + n;
		
		return s;
	}	



	public static void main(String[] args){
		//int N =  Integer.parseInt(args[0]);
		
		while(true){
		String  result = exR1(50);
		StdOut.println(result);	
		}

		//String  result = exR1(N);

		//StdOut.println(result);

	}

}