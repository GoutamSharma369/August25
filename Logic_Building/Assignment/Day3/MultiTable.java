public class MultiTable {

    public static int printMultuiTable(int num){
        for(int n=1; n<=10; n++){
            int table=num *n;
            System.out.println(num + "x" + n +"="+table);
        }
        return 0;
    }


    public static void main(String[] args){

    printMultuiTable(5);

    }
}
