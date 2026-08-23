package Assignment4;

import java.util.Scanner;

public class LargElemArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];


        System.out.println("Enter numbvers");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int lg=arr[0];

        for(int x: arr){
            if(x>lg){
                lg=x;
            }
        }
        System.out.println(lg);

    }
}
