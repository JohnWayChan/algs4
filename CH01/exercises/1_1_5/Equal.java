
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import java.util.Arrays;


public class  Equal{

	public  static void  isEqual(int a, int b, int c){
		if(a == b  && b == c){
			StdOut.println("Equal");
		}else{
			StdOut.println("Not Equal");
		}
	}

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b =  Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		isEqual(a,b,c);
		//for (int i=0; args != null && i<args.length; i++) {   
          		  //System.out.println("第" + i + "个参数：" + args[i]);   	
	}


}