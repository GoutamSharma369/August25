
import java.util.Scanner;

public class SumOfnumbers {
    public static int SumOFTwoNumber(int num1,int num2){
        int result = num1 + num2;
        return result;
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter first number: "+ num1);

        System.out.println("Enter second number: "+ num2);
        int sum=SumOFTwoNumber(num1,num2);
        System.out.println("The sum of "+ num1 + " and "+ num2 +" is " + sum);

    }
}

