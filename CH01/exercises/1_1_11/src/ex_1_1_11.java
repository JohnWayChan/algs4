import edu.princeton.cs.algs4.StdOut;


public class ex_1_1_11 {

	public static void func_11(){
		boolean[][]  arr = {
												{true,true,true},
												{false,false,true}
												};
		
		String val="";   
		
		for(int i = 0; i < arr.length;i++ ){
			for(int j = 0; j < arr[i].length;j++){
				if(arr[i][j]){
					val = "*";
				}else{
					val = " ";
				}
				
				StdOut.println("行号:"+i+","+ "列号:"+j+ ": " + val);
			}
		}
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func_11();
	}

}
