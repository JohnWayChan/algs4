import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

class BooleArray{


	public static int gcd(int p,int q){
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q,r);
	}

	public static void main(String[] args){
		int n = 10;
		boolean[][] array = new boolean[n][n];


		for (int i=0; i< n; i++) {
			for (int j=0; j< n;j++ ) {
				if(gcd(i,j) == 1){
					array[i][j] = true;
				}else{
					array[i][j] = false;
				}
			}
		}
		
		for (int i=0; i< n; i++) {
			for (int j=0; j< n;j++ ) {
				StdOut.printf("%5s ",array[i][j]);
			}
			StdOut.println(" ");
		}



	}

}