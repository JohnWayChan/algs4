import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import java.util.Arrays;

public class ex_12{

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i=0; i<10; i++) {
			a[i] = 9 -i;
		}

		for(int i = 0;i<10;i++){
			a[i]=a[a[i]];
		}

		for(int i = 0;i<10; i++){
			System.out.println(i);
		}
	}

}