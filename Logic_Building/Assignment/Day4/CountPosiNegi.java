package Assignment4;

import java.util.Scanner;

public class CountPosiNegi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[6];

        int posi=0;
        int negi=0;

        System.out.println("enter numbers" );

        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

            if(arr[i]>0){
                posi++;
            }else if (arr[i]<0){
                negi++;
            }
        }
        System.out.println(posi );
        System.out.println(negi );
    }
}
