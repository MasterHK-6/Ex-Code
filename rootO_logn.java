import java.util.*;

class rootO_logn{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number to find root:");
		int n=s.nextInt();

		int start=0,end=n;
		int mid,ans=0;

		while(start<=end){
			mid=(start+end)/2;

			if(mid*mid==n){
				ans=mid;
				break;
			}

			if(mid*mid<n){
				start=mid+1;
				ans=mid;
			}
			else{
				end=mid-1;
			}
		}

		System.out.println("Squareroot is: "+ans);
	}
}