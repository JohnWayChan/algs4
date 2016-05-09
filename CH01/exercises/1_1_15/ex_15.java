import edu.princeton.cs.algs4.StdOut;

public class ex_15{

	public static int[] histogram(int[] a,int M){
		int[] b = new int[M];

		for(int i = 0; i<M; i++){
			int counter = 0;
			for (int j = 0; j<M; j++ ) {
				if(i == a[j]){
					counter++;
				}
				b[i] = counter;
			}
		}

		return b;
	}


	public static void main(String[] args) {
		int[] a = {1,1,1,1,1,2,2,4,5,6};

		int[] b = new int[10];

		b = histogram(a,10);
		
		for (int i = 0; i<10;i++ ) {
			StdOut.println(b[i]);
		}
	}
}