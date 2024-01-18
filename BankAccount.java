import java.util.Scanner;
public class BankAccount{
  Scanner input = new Scanner(System.in);
String name;
int accountNum;
double balance;

  public BankAccount(String name, int accountNum, double balance)
  {
    this.name = name;
    this.accountNum = accountNum;
    this.balance = balance;
  }

  public void deposit(double amount){
    
      while(amount<0) {
        System.out.println("invalid deposit");
        System.out.println("Please enter a valid deposit or press 0 if you don't want to deposit money");
         amount = input.nextDouble();
      }
      balance+=amount;
      this.balanceDisplay();
   
    }

  public void withdraw(double amount){
    while(amount<=0|| amount>balance){
      System.out.println("invalid withdrawal, Please enter a valid input or 0 if you do not want to withdraw");
      System.out.println("Enter how much you would like to withdraw");
      amount = input.nextDouble();
    }
   
    balance-=amount;
    this.balanceDisplay();
  }
  
public void balanceDisplay(){
    System.out.println("Account " + accountNum + " balance: $" + balance);
  }
}
