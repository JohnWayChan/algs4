import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;



public class ex_21{

	public static void main(String[] args){

		String[] allStrings = StdIn.readAllStrings();

		for(int i=0;i<allStrings.length;i+=3){
			StdOut.print(allStrings[i] + " " + allStrings[i+1] + " " + allStrings[i+2] + " ");
		
			double num1 = Double.parseDouble(allStrings[i+1]);
			double num2 = Double.parseDouble(allStrings[i+2]);

			StdOut.printf("%.3f\n",num1/num2);


		}
		

		
	}


}
