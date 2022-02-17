package selectionSort;
import java.util.*;

public class selectionSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []a=new int[10];
		for(int i=0;i<a.length;i++){
			System.out.print("enter element"+(i+1)+": ");
			a[i]=s.nextInt();
		}	
		System.out.println("before sorting");
		printArray(a);
		System.out.println("after sorting");
		sort(a);
		printArray(a);

		

		
		
		

	}
	public static void sort(int[]arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min_index=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
	}
	public static void printArray(int []arr){
		 int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	}

}
