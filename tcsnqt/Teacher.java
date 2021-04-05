package tcsnqt;
import java.util.*;
public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limits N1 and N2 : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1>0 && n2>0) {
			
			//finding if amstrong or not
			
			for(int i=n1;i<=n2;i++) {
				int chk=0;
				int rem=0,temp=i;
				while(i>0) {
					rem=i%10;
					i=i/10;
					chk=chk+(rem*rem*rem); 
				}System.out.println(chk);
				if(temp==chk) {
					
					System.out.println("Amstrong Number");
					break;
				}
					
				
			}
			
			
		}else {
			System.out.println("wrong input!");
		}
		
	}

}
