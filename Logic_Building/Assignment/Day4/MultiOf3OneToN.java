package Assignment4;
import java.util.Scanner;
public class MultiOf3OneToN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        int n= sc.nextInt();

        for(int i=1; i<n; i++){
            if(i%3==0){
                System.out.print(" "+i);
            }
        }

    }
}
