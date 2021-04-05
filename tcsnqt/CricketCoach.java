package tcsnqt;
import java.util.*;

public class CricketCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r=sc.nextInt();
		double area;
		double pi=3.1415;
		if(r>=20 && r<=30) {
			area=pi*r*r;
			System.out.format("the area is "+"%.3f", area);
//			System.out.println("The area of the ground is "+area);
		}else {
			System.out.println("Invalid input!");
		}
	}

}
