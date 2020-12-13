package chapter11;

public class TestString {
	public static void main(String[] args) {
		int[][] oldArr = new int[11][11];
		oldArr[1][2] = 1;
		oldArr[2][3] = 2;
		print2Arr(oldArr);
		
		//压缩
		int oldRows = oldArr.length;
		int oldCols = oldArr[0].length;
		int countHasValRow = 0;
		for (int i = 0; i < oldArr.length; i++) {
			for (int j = 0;j < oldArr[i].length; j++) {
				if (oldArr[i][j] != 0) {
					countHasValRow++;
				}
			}
		}
		int[][] newArr = new int[countHasValRow + 1][3];
		newArr[0][0] = oldRows;
		newArr[0][1] = oldCols;
		newArr[0][2] = countHasValRow;
		int curRow = 1;
		for (int i = 0; i < oldArr.length; i++) {
			for (int j = 0;j < oldArr[i].length; j++) {
				if (oldArr[i][j] != 0) {
					newArr[curRow][0] = i;
					newArr[curRow][1] = j;
					newArr[curRow][2] = oldArr[i][j];
					curRow++;
				}
			}
		}
		
		print2Arr(newArr);
		
		
		//解压
		int[][] newToOld = new int[newArr[0][0]][newArr[0][1]];
		
		for (int i = 1;i < newArr.length; i++) {
			int a = newArr[i][0];
			int b = newArr[i][1];
			int val = newArr[i][2];
			newToOld[a][b] = val;
		}
		
		print2Arr(newToOld);
	}

	private static void print2Arr(int[][] oldArr) {
		for (int i = 0; i < oldArr.length; i++) {
			for (int j = 0;j < oldArr[i].length; j++) {
				System.out.print(oldArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
