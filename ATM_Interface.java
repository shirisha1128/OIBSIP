import java.util.Scanner;
public class ATM_Interface
{
    public static void main(String args[])
    { 
        int balance = 20000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        int pin=2817;
        System.out.println("Enter your pin number: ");
        int pin_No=s.nextInt();
        if(pin_No!=2817)
        {
            System.out.println("Wrong pin Number!! ");
            System.exit(0);
        }
        if(pin_No==2817)
        {
            System.out.println("------Welcome to ATM services------");  
            while(true)
            {
                System.out.println("Enter 1 to Check your Balance amount");
                System.out.println("Enter 2 to Withdraw money");
                System.out.println("Enter 3 to Deposit money");
                System.out.println("Enter 4 to EXIT");
                System.out.print("Choose the corresponing operation you want to perform: ");
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                    System.out.println("Your Balance is : "+balance);
                    System.out.println("");
                    break;

                    case 2:
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                        System.out.println("Insufficient Balance!!");
                    System.out.println(" ");
                    break;
 
                    case 3:
                    System.out.print("Enter money to be deposited: ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println(" ");
                    break;
 
                    case 4:
                    System.out.println("Thank you! Visit again...");
                    System.exit(0);
                }
            }
       }
    }
}