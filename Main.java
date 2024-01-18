import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name: ");
    String name = input.nextLine();
    
    Random random = new Random();
     int randomInt = random.nextInt(8999) + 1000; //generates random banking number from 1000 to 9999
     int accountNum = randomInt;
    System.out.println("Account number: " + accountNum);
    
    System.out.println("Enter current balance");
    double balance = input.nextDouble();
    BankAccount account = new BankAccount(name, accountNum, balance);
    
    String options = "q";
    while(! options.equalsIgnoreCase("n")){
      input.nextLine();
      System.out.println("Would you like to access your account? y/n");
       options = input.nextLine();
      if(options.equalsIgnoreCase("n")){
        System.exit(0);
      }
      else if(options.equalsIgnoreCase("y")){
        System.out.println("Would you like to withdraw? deposit, or display current balance");
        String choices = input.nextLine();
        
        
        if(choices.equalsIgnoreCase("withdraw")){
          System.out.println("Enter how much $ you want to withdraw");
          double withdraw = input.nextDouble();
          account.withdraw(withdraw);
        }
        else if(choices.equalsIgnoreCase("deposit")){
          System.out.println("How much would you like to deposit into your account?");
          double deposit = input.nextDouble();
          account.deposit(deposit);
        }
        else if(choices.equalsIgnoreCase("display current balance")){
          account.balanceDisplay();
        }
      }
      else{
        System.out.println("Invalid option");
        continue;
      }
      
    }
  }
}
