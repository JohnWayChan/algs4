import edu.princeton.cs.algs4.StdOut;

public class ex_13{
	
	public static void main(String[] args){
		//定義二維數組
		int[][] arr = {
				{1,2,3,4},
				{10,11,12,13},
				{16,17,18,19},
				{20,13,14,15}
			};

			//交換
			int[][] arr2 = new int[4][4];
			for(int i=0;i<4;i++){
				for(int j = 0;j<4;j++){
					arr2[i][j] = arr[j][i];
					arr2[j][i] = arr[i][j];

				}

			}
			//打印
			for(int i=0;i<arr2.length;i++){
				for(int j = 0;j<arr2[i].length;j++){
					StdOut.print(arr2[i][j]);
					StdOut.print(' ');
				}
				StdOut.println();
			}
	}

}