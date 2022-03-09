import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of Values :");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values one by one:");
		for(int i = 0; i < n; i++) 
			arr[i] = in.nextInt();

		double start = System.nanoTime();
		for(int i = 0; i < n; i++) {
			int j = i-1;
			while(j >= 0 && arr[i] < arr[j]) {
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				j--;
				i--;
			}
		}
		double timeTaken = (System.nanoTime() - start) / 1000000;

		System.out.println("Sorted array : " + Arrays.toString(arr) + "\n Time taken is " + timeTaken + " ms");
	}
}