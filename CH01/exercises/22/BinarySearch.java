
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class BinarySearch {

	 //數組必須有序
    /*
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
    */

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1,0);
    }

    public static int rank(int key, int[] a, int lo, int hi,int depth){

        //打印深度缩进
        for (int i=0; i<depth;i++ ) {
            StdOut.print(' ');
        }

        //打印lo,hi以及嵌套深度
        StdOut.printf("lo:%2d, hi:%2d, depth:%2d\n",lo,hi,depth);
        depth += 1;

        if(lo > hi) return -1;
        int mid = lo + (hi - lo) /2;
        if(key < a[mid]){
            return rank(key,a,lo,mid-1,depth);
        }else if(key > a[mid]){
            return rank(key,a,mid+1,hi,depth);
        }else{
            return mid;
        }

    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] whitelist = In.readInts(args[0]);
		 // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
		
        Arrays.sort(whitelist);
        
       
        for(int i= 0;i<whitelist.length;i++){
            StdOut.println(whitelist[i]);

        }

        StdOut.printf("\n");
        
        while(!StdIn.isEmpty()){
            int key =StdIn.readInt();
        	if(rank(key,whitelist) < 0){
                StdOut.println(key);
                StdOut.printf("\n");


            }
        }
        
	}

}
