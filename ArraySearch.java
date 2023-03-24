package cycle2;

import java.util.*;

public class ArraySearch {

	public static void main(String[] args){
		int flag = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int num = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(num + " is not found in the array.");
		else
			System.out.println(num + " is found in the array.");
	}

}
