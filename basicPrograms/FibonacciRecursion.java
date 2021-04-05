package basicPrograms;
import java.util.*;
public class FibonacciRecursion {
	
	static int n1=0,n2=1,n3=0;
	static void printFibonacci(int n) {
		if(n>0) {
		n3=n1+n2;
		System.out.print(" "+n3+" ");
		n1=n2;
		n2=n3;
		printFibonacci(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("how may fibonacci numbers do you want?");
		int n=sc.nextInt();
		System.out.print(n1+" "+n2+" ");
		printFibonacci(n-2);
		
		
	}

}
