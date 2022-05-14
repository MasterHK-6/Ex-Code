import java.util.*;

class root{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number to find root:");
		int n=s.nextInt();

		for (int i=n; i>0; i--) {
			if((i*i)<=n){
				System.out.println("Squareroot is: "+i);
				break;
			}
		}
	}
}