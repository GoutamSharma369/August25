package Assignment4;

import java.util.Scanner;

public class AllElemArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] n=new int[5];
        System.out.println("enter 5 int ");

        for (int i=0; i<n.length; i++){
            n[i]=sc.nextInt();

        }
        for(int x:n){
            System.out.print(x+" ");
        }
    }

}
