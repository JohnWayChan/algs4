
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;


public class CleanSameData{
	public static void main(String[] args) {
		int[] whitelist = {1,1,2,3,4,4,5,6,1,8,9,1,10};
		Arrays.sort(whitelist);

		int [] whitelist2 = new int[whitelist.length];

		whitelist2[0] = whitelist[0];

		int currentIndex=0;
		for (int i =0;i<whitelist.length-1 ;i++ ) {
			if(whitelist[i] != whitelist[i+1]){
				whitelist2[currentIndex+1] = whitelist[i+1];
				currentIndex++;
			}
		}

		
		for(int i= 0;i<whitelist.length;i++){
            StdOut.println(whitelist[i]);
        }

/*
        for(int i= 0;i<currentIndex;i++){
            StdOut.println(whitelist2[i]);
        }
*/
        int[] whitelist3 = new int[currentIndex];
        for (int i = 0; i <currentIndex ;i++ ) {
         	whitelist3[i] = whitelist2[i];
         } 

        for(int i= 0;i<currentIndex;i++){
            StdOut.println(whitelist3[i]);
        }



	
	}

}