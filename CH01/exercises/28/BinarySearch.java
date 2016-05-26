
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class BinarySearch {

	 //數組必須有序
    
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length -1;
        while(lo <= hi){
            int mid = lo + (lo+hi) / 2;
            if(key < a[mid]){
                hi = mid -1;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist1 = in.readAllInts();
		 
        Arrays.sort(whitelist1);

        for(int i= 0;i<whitelist1.length;i++){
            StdOut.println(whitelist1[i]);

        }

        StdOut.println("-----------------------------------");

        int N = whitelist1.length;
        int[] whitelist2 = new int[N];



        whitelist2[0] = whitelist1[0];

        int currentIndex = 0;
        for (int i = 0; i < N-1; i++) {
            if (whitelist1[i] != whitelist1[i+1]) {
                whitelist2[currentIndex] = whitelist1[i+1];
                currentIndex++;
            }
        }

        int[] whitelist = new int[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            whitelist[i] = whitelist2[i];
        }


       
        for(int i= 0;i<whitelist.length;i++){
            StdOut.println(whitelist[i]);

        }

        StdOut.println("-----------------------------------");
        
        
        while(!StdIn.isEmpty()){
            int key =StdIn.readInt();
            //int key = 18;
        	if(rank(key,whitelist) < 0){
                StdOut.println(key);
            }
        }
        
	}

}
