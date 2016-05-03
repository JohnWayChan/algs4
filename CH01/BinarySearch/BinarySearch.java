
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
		//int[] whitelist = In.readInts(args[0]);
		 // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
		//int[] whitelist = {23,50,10,99,18,23,98,84,11,10,48,77,13,54,98,77,77,68};
		
        Arrays.sort(whitelist);
       
        for(int i= 0;i<whitelist.length;i++){
            StdOut.println(whitelist[i]);

        }
        
        while(!StdIn.isEmpty()){
            int key =StdIn.readInt();
            //int key = 18;
        	if(rank(key,whitelist) < 0){
                StdOut.println(key);
            }
        }
        
	}

}
