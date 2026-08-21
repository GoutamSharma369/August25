public class PriveEvenNo {

    public static void PrintEvenNumbers(){
        int n=1;
        while(n<=50){
            if(n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }

    public static void main(String[] args){

        PrintEvenNumbers();

    }
}
