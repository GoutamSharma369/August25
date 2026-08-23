package Assignment4;

import java.util.Scanner;

public class NameStringArr {

    public static void main(String[] args){

        String[] arr=new String[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 5 string");

        for(int i=0; i<5; i++){
            arr[i]=sc.next();
        }
        for(String name:arr){
            System.out.println(name);
        }

    }
}
