import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Gcd{

public static int Euclid(int p,int q){
	StdOut.println("p: "+p+" , "+"q: "+q);
	if(q==0){
		return p;
	}
	int r = p % q;
	return Euclid(q,r);
}

public static void main(String[] args) {
	int p = Integer.parseInt(args[0]);
	int q = Integer.parseInt(args[1]);

	int result = Euclid(p,q);
	StdOut.println("最大公约数: "+ result);

}


}