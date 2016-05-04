
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class ex_1_1_5{

	public static void function_1_15(double num){
		if(num > 0 && num < 1){
			StdOut.println("true");
		}else{
			StdOut.println("false");
		}
	}

	public static void main(String[] args) {
		double num = Double.parseDouble(args[0]);
		function_1_15(num);
	}


}