import java.util.*;

class PascalTriangle{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int n=s.nextInt();

		int a[][]=new int[n][n];

		for (int row=0; row<n; row++){
			for (int k=n; k>row; k--) {
				System.out.print(" ");
			}

			for (int col=0; col<=row; col++) {
				
				if (col==0 || col==row) {
					a[row][col]=1;
					System.out.print(" ");
				}
				else{
					a[row][col]=a[row-1][col]+a[row-1][col-1];
					System.out.print(" ");
				}

				System.out.print(a[row][col]);
			}
			System.out.println();
		}
	}
}