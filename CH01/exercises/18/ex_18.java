import edu.princeton.cs.algs4.StdOut;

public class ex_18{
/*
	public static int mystery(int a, int b){

		if (b == 0) return 0;

		if (b%2 == 0)  return mystery(a+a, b/2);

		return mystery(a+a, b/2) + a;
	}
*/


	public static int mystery(int a, int b){

		if (b == 0) return 1;

		if (b%2 == 0)  return mystery(a*a, b/2);

		return mystery(a*a, b/2) * a;
	}
	public static void main(String[] args){
		int result = mystery(2,25);
		//int result = mystery(3,11);


		StdOut.println(result);
	}



}