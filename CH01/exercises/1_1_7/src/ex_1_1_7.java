
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
 
public class ex_1_1_7 {

	public static void function_a(){
		double t = 9.0;
		while(Math.abs(t - 9.0 / t)  > .001){
			t = (9.0/t + t) / 2.0;
			StdOut.printf("%.5f\n", t);
		}
	}
	
	public static void function_b(){
		int sum = 0;
		for(int i = 1;i < 4; i++){
			for(int j = 0;j < i; j++){
				sum++;
				StdOut.println(sum);
			}
		}
	}
	
	public static void function_c(){
		int sum = 0;
		for(int i = 1; i<1000; i *=2){
			for(int j = 0;j < 1000;j++){
				sum++;
				StdOut.println(sum);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//function_a();
		//function_b()
		function_c();;

	}

}
