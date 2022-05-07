import java.util.*;

class stringCount{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter any string:");
		String str=s.nextLine();

		int words=0,character=0,num=0,ascii;
		char c;

		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if(c==' '){
				words++;
			}

			ascii=c;

			if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122){
				character++;
			}

			if(ascii>=48 && ascii<=57){
				num++;
			}

		}
		System.out.println("Words are: "+(words+1));
		System.out.println("Character are: "+character);
		System.out.println("Numbers are: "+num);
	}
}