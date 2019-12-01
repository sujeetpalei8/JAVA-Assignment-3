import java.util.Scanner;
import java.util.*;
public class ReverseString {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ReverseString obj=new ReverseString();
		System.out.println("Enter a String to reverse:");
		String str=sc.next();
		obj.revString(str);
	}
	public void revString(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
			
		}
		System.out.println("The reverse of the String is: "+str1);
	}
}
