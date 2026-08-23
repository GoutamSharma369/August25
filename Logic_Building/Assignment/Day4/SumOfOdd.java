package Assignment4;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<n; i++){
            if(i%2==1){
//                System.out.print(" "+i);
                sum=sum+i;
            }
        }
        System.out.println("The sum of odd number from 1 to "+ n +" is : "+sum);

    }
}
