import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_9 {

	/**
	 * @param n
	 * 
	 * 输入整数，转换为二进制数
	 */
	 public static void toBingaryString(int n){
		String result = "";
		while(n > 0){
			result =( n %2) + result;
			n =  n/2;
			StdOut.println(result);

		}
		StdOut.println("The rssult is: "+result);

	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N = 6;
	//	String number = Integer.toBinaryString(N);
		//System.out.println(number);
		int n = Integer.parseInt(args[0]);
		//int n = 4;
		toBingaryString(n);
	}

}
