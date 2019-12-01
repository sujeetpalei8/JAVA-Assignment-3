import java.util.Scanner;
public class ReverseInt {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ReverseInt obj=new ReverseInt();
		System.out.println("Enter a number to reverse:");
		int num=sc.nextInt();
		obj.revNum(num);
	}
	public void revNum(int num) {
		int sum=0;
		while(num>0) {
			sum = sum*10 + num%10; 
	        num = num/10;
		}
		System.out.println("The reverse of the number is: "+sum);
	}
}
