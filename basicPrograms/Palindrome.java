package basicPrograms;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int r=0,rev=0;	//r => remainder   rev => reversed number  123
		while(num>0) {	//123
			r=num%10;	//3
			num=num/10;	//12
			rev=(rev*10)+r;//31236
		}
		if(num == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}

}
