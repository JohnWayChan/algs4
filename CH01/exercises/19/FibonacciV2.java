import edu.princeton.cs.algs4.StdOut;

public class FibonacciV2
{
	
	public static long[] fibArray = new long[100];

	public static void F(int N){

		if(N == 0){
			fibArray[N] = 0;
		}else if(N == 1){
			fibArray[N] = 1;
		}else {
			fibArray[N] = fibArray[N-1]+fibArray[N-2];
		}

	}

	public static void main(String[] args){
		for(int N = 0;N < 100;N++){
			F(N);
			StdOut.println(N + " " + fibArray[N]);
		}
			
	}

}