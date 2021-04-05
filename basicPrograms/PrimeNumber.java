package basicPrograms;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be checked : ");
		int num = sc.nextInt();
		
		int count=0;
		if(num>0) {
				for(int i=1;i<=num;i++) {
					if(num%i == 0) {
						count=count+1;
					}	
				}
				
				if(count == 2) {
					System.out.println(num+" is a prime number.");
				}else {
					System.out.println("Not a prime number.");
				}
			
			
		}else {
			System.out.println("Not a prime number.");
		}
	}

}
