package basicPrograms;
import java.util.*;
public class factorial {
static int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
//			System.out.print(fact);
			
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
		
		
	}

}
