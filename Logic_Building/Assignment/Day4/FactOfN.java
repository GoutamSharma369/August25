package Assignment4;
import java.util.Scanner;
public class FactOfN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");

        int fact=1;
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n==1 || n==0){
                System.out.println("fact of 0 and 1 is 1" );
                break;
            }else{
                fact=fact*i;
                System.out.println(fact);
            }
        }
    }

}
