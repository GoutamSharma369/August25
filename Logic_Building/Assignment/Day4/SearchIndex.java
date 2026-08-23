package Assignment4;

import java.util.Scanner;
import java.util.Arrays;

public class SearchIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integer:");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter the number to search: ");
        int n = sc.nextInt();

        int indx=Arrays.binarySearch(arr, n);
        if (indx>=0) {
            System.out.println("The number " + n + " is found at indx " + indx);
        } else {
            System.out.println("not Found");
        }
    }
}
