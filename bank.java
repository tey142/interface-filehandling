import java.util.Scanner;
interface collectdata{
    public void fdebt();
    public void fyear();
    public void finterest();
}
public class bank implements collectdata{
    Scanner sc=new Scanner(System.in);
    float debt=0;
    float years=0;
    float interest=0;
    public void fdebt(){
        System.out.println("how much debt are you in?");
        debt=sc.nextFloat();
        if(debt<=0){
        System.out.println("congratulations! you have no debt");
        return;
    }
    }
    public void fyear(){
        System.out.println("how many years do you have to pay it off?");
        years=sc.nextFloat();
    }
    public void finterest(){
        System.out.println("what is your interest rate?");
        interest=sc.nextFloat();
    }
    public static void main(String[]args){
        bank ob=new bank();
        ob.fdebt();
        ob.fyear();
        ob.finterest();
        float peryear=0;
        float realperyear=0;
        try{
        peryear=ob.debt/ob.years;
        realperyear=peryear*((ob.interest/100)+1);
        }catch(ArithmeticException ex){
            System.out.println("~~~~catch block:invalid input~~~~");
            System.out.println(ex.toString());
        }finally{
            System.out.println("~~~~finally block~~~~");
        }
        System.out.println("\n~~~~overview~~~~");
        System.out.println("debt: "+ob.debt);
        System.out.println("years to pay it off: "+ob.years);
        System.out.println("interest rate: "+ob.interest);
        System.out.println("amount payed per year without interest: "+peryear);
        System.out.println("amount payed per year with interest: "+realperyear);
    }
}