package array;
import java.util.*;
public class ArrayLeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of the array : ");
		int n=sc.nextInt();
		int[] arr=new int [n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before rotating ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//-----rotating array-------
		//[10,20,30,40,50]  =>  [20,30,40,50,10]
		
		int temp=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=arr[i+1];
		}
		arr[n]=temp;
		
		//-------printing rotated array--------
		System.out.print("Array after rotating ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
