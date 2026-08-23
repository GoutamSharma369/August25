package Assignment4;

import java.util.Scanner;
import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("enter 5 int:");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search:");
        int n = sc.nextInt();

        if (Arrays.asList(arr).contains(n)) {
            System.out.println("found");
        } else {
            System.out.println("No Found");
        }
    }
}
