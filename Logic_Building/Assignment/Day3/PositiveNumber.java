import java.util.Scanner;

public class PositiveNumber {

    static void askForPositiveNumber(){
        Scanner sc=new Scanner(System.in);
        int num;
    do{
        System.out.print("ENter positive number");
        num=sc.nextInt();
    }while(num<=0);
        System.out.print("ENtered positive no.");
    }

    public static void main(String[] args){
        askForPositiveNumber();
    }
}
