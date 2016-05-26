
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class BinarySearch {

	 //數組必須有序
    public static int rank2(int key,int[] a){
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
    
    //统计小于键值的数组元素数量
    public static int rank(int key,int[] a){
        int count = 0;
        for (int i=0; i<a.length;i++ ) {
            if(key > a[i]){
                count++;
            }
        }
        return count;
    }

    //统计等于键值的数组元素数量
        public static int count(int key,int[] a){
        int count = 0;
        for (int i=0; i<a.length;i++ ) {
            if(key == a[i]){
                count++;
            }
        }
        return count;
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
        

        /*
        while(!StdIn.isEmpty()){
            int key =StdIn.readInt();
            //int key = 18;
        	if(rank(key,whitelist) < 0){
                StdOut.println(key);
            }
        }*/
        StdOut.println("----------------------------------");

        int key = 10;
        int count = rank(key,whitelist);
        StdOut.println(count);
        
       StdOut.println("----------------------------------");
        count = count(key,whitelist);
       StdOut.println(count);

	}

}
