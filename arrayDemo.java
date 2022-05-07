/**
 * Definition: WAP to reverse an array in the same array without creating new array.
 * 
 * Author name: Hemang Kateshiya
 * Creation Date: 07/05/2022 
 * 
 */

/*
 MODIFICATION HISTORY
 
 Modified on 07 may 10:03 by Hemang Kateshiya [core logic]

*/

import java.util.*;

class arrayDemo{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=s.nextInt();

 		int a[]=new int[n],temp,x,y;

 		System.out.println("Enter elements of an array:");
 		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}

		int t=n;
		for(int i=0;i<a.length/2;i++,t--){
			x=a[i];
			y=a[t-1];

			x=x+y;
			y=x-y;
			x=x-y;

			a[i]=x;
			a[t-1]=y;
		}

		System.out.println("Reversed array is: ");

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}