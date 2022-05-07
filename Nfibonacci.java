import java.util.*;

class Nfibonacci{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter n:");
		int n=s.nextInt();
		int i=0,n1=0,n2=1,temp;

		while(i<5){

			if(n1>=n){
				System.out.print(n1+" ");
				i++;
			}
			temp=n2;
			n2=n1+n2;
			n1=temp;
		}
		System.out.println();
	}
}