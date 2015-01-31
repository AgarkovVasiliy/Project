package arraysAndString;

/*We have image hood size M * N, were everyone pixels 4 bait. 
 * Create function rotate image on 90 (rotate) & 180 (rotate2) */
public class Rotate {

	public void rotate(int[][] matrix, int n) {
		for (int i = 0; i < n / 2; ++i) {
			int first = i;
			int last = n - 1 - i;
			for (int j = first; j < last; ++j) {
				int offset = j - first;
				int top = matrix[first][j];
				matrix[first][j] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[j][last];
				matrix[j][last] = top;
			}
		}
	}

	public void rotate2(int[][] matrix, int n) {
		for (int i = 0; i < n / 2; ++i) {
			int first = i;
			int last = n - 1 - i;
			for (int j = first; j < last; ++j) {
				int offset = j - first;
				int top = matrix[first][j];
				int left = matrix[last - offset][first];
				matrix[first][j] = matrix[last][last - offset];
				matrix[last][last - offset] = top;
				matrix[last - offset][first] = matrix[j][last];
				matrix[j][last] = left;
			}
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 3, 2 }, { 2, 3, 1 }, { 3, 1, 2 } };
		new Rotate().rotate(mat, 3);
		new Rotate().rotate2(mat, 3);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}
