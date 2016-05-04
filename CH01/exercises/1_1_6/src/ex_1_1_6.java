
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class ex_1_1_6 {
/**
 * 打印Fibonacci number
 */
	public static void function_1_1_6(){
		int f = 0;
		int g =1;
		
		for(int i = 0; i <=15;i++){
			StdOut.println(f);
			f = f +g;
			g = f -g;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function_1_1_6();
	}

}
