package cycle2;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int num:a) {
			sum=sum+num;
		}
		System.out.println("Sum is: "+sum);
	}

}
