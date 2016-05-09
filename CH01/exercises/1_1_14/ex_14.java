import edu.princeton.cs.algs4.StdOut;
import java.lang.Math;

public class ex_14{
	//使用數學函數庫
	public static void useMathLib(double N){
		//換底公式
		double result = Math.log(N) / Math.log(2);
		StdOut.println(result);
	}


	public static int lg(int N,int M){
		int a=0;
		while(N>=M){
			N = N / M;
			a++;

		}

		return a;
	}


	public static void main(String[] args){
		int a = lg(10,2);
		StdOut.println(a);

		useMathLib(10);
	}


}



