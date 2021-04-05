package array;
import java.util.*;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		System.out.println("how many elements?");
	int n=sc.nextInt();
	System.out.print("enter the array elements: ");
	int[] arr1=new int[n];
	// reading the array elements as input
	for(int i=0;i<n;i++) {
		arr1[i] = sc.nextInt();
	}

	//---copying array1 to array 2
	int[] arr2=new int[n];
	for(int i=0;i<n;i++) {
		arr2[i] = arr1[i];
	}
	//------printing both arrays as output---
	System.out.print("arr1 elements are :");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.print("arr2 elements are :");
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}

}
}
