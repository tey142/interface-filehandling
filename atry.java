import java.util.Scanner;
public class atry{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter 2 numbers: ");
            float x=sc.nextFloat();
            float y=sc.nextFloat();
            float z=x/y;
            System.out.println(x+"/"+y+"="+z);
        }
        catch(ArithmaticException ex){
            System.out.println("~~~~Block~~~~");
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("~~~~finally block~~~~");
            System.out.println("program designed by team@codingal");
        }
        System.out.println("~~~~done~~~~");
        sc.close();
    }
}