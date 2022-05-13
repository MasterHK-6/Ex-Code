import java.util.*;

class SpiralMatrix{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int n=s.nextInt();

		int a[][]=new int[n][n];
		int val=1;
		int minCol=0,maxCol=n-1;
		int minRow=0,maxRow=n-1;

		while(val<=n*n){
			for (int i=minCol; i<=maxCol; i++) {
				a[minRow][i]=val;
				val++;
			}

			for (int i=minRow+1; i<=maxRow; i++) {
				a[i][maxCol]=val;
				val++;
			}

			for (int i=maxCol-1; i>=minCol; i--) {
				a[maxRow][i]=val;
				val++;
			}

			for (int i=maxRow-1; i>=minRow+1; i--) {
				a[i][minCol]=val;
				val++;
			}

			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
		}

		System.out.println("Spiral Matrix: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
	}
}