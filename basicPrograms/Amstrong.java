package basicPrograms;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int temp=num;
		int chk=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			chk = chk +(rem*rem*rem);
		}
		if(chk==temp) {
			System.out.println(temp +" is an Amstrong number. ");
		}else {
			System.out.println(temp+" is not an Amstrong number. ");
		}
		

	}

}
