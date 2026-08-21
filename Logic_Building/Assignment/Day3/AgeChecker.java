import java.util.Scanner;

public class AgeChecker {
    public static int checkAgeCategory(int a){

        if(a<18){
            System.out.println("You are an minior");
        }
        else if(a>=18 && a<60){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are an senior citizen");
        }
        return a;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your age : ");
        int age= sc.nextInt();

        int result=checkAgeCategory(age);
        System.out.println(result);
    }
}
