
public class ImageSmoother {

	public static void main(String[] args) {
		int[][] arr = imageSmoother(new int[][] { { 1, 2, 1 }, { 2, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } });
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] imageSmoother(int[][] M) {
		int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, 
						{ 0, -1 }, { 0, 0 }, { 0, 1 }, 
						{ 1, -1 }, { 1, 0 }, { 1, 1 } };
		
		int [][] res = new int[M.length][M[0].length];
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				int count = 0;
				int sum = 0;
				
				for (int k = 0; k < dir.length; k++) {
					int row = i + dir[k][0];
					int col = j + dir[k][1];
					
					System.out.print("{" + row + "," + col + "}, ");
					if(row >= 0 && row < M.length && col >= 0 && col < M[0].length) {
						sum += M[row][col];
						count++;
					}
				}
				
				res[i][j] = sum/count;
				
				System.out.print("   " + sum + "   " + count + "         ");
			}
			
			System.out.println("");
		}
		return res;
	}

}
