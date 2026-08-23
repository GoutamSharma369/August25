package Assignment4;
import java.util.Scanner;
public class AvgOfArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        System.out.println("enter no ");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        double avg=0;

        avg=sum/arr.length;
        System.out.println(avg);

    }
}
