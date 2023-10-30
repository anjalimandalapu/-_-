import java.util.*;
public class ATM{
    public static void main(String args[]){
        ATM_Machine a=new ATM_Machine();
        a.Run();
    }
}
class ATM_Machine{
    Scanner sc=new Scanner(System.in);
    int total=0;
    public void Deposit(){
         System.out.println("Enter the amount to be deposited");
        int dep=sc.nextInt();
       
        total=total+dep;
        Run();
    }
    public void Withdraw(){
        System.out.println("Enter the amount to be Withdraw :");
        int draw=sc.nextInt();
        if(total>1000){
        total=total-draw;
       
        }
        else{
           System.out.println("Your transactioned is failed") ;
        }
        Run();
    }
    
    public void Checkbalance(){
    
        System.out.println("The remaining balance is:" +total);
        Run();
    }
    public void Run(){
        
    System.out.println("Select the numbers to perform the operations \n");
    System.out.println("1:Deposit\n");
    System.out.println("2.Withdraw\n");
    System.out.println("3.CheckBalance\n");
    System.out.println("Enter the number:");
    int reenter=sc.nextInt();
    if(reenter==1){
        Deposit();
    }
   else if(reenter==2){
        Withdraw();
    }
   else if(reenter==3){
        Checkbalance();
    }
    else{
        System.out.println("Your transaction is compeleted");
    }
    
    } 
}
