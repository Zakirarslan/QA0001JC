package d30JavaPractice.C08_Bank;

 class C08_BankAccount {

    // Create a class called "BankAccount" with the following private properties: "accountNumber" (String), "balance" (double).
     private String accountNumber="";
      private double balance=0;
    // Provide public getter and setter methods for the "accountNumber" and "balance" properties to allow controlled access to these properties.
    // Write a method called "deposit" that takes an amount (double) as a parameter and adds it to the balance.
    // Write a method called "withdraw" that takes an amount (double) as a parameter and subtracts it from the balance if there are sufficient funds; otherwise, print an error message.
    // In the main method, create an instance of the "BankAccount" class, set the account number and initial balance, and test the deposit and withdraw methods.
    //set accountNumber = "123456789"
    //set balance = 1000
    // deposit = 500
    // withdraw = 200
    // Test insufficient funds = 2000


   public String getAccountNumber() {
       return accountNumber;
   }
  public double getBalance() {
       return balance;
   }
  public void setAccountNumber(String accountNumber) {
       this.accountNumber = accountNumber;
   }
  public void setBalance(double balance) {
       this.balance = balance;
   }

     // Write a method called "deposit" that takes an amount (double) as a parameter and adds it to the balance.
    public void deposit(double a){
       balance=a;
        System.out.println("Your balance is " + balance);
    }

     /* Write a method called "withdraw" that takes an amount (double) as a parameter
             and subtracts it from the balance if there are sufficient funds; otherwise, print an error message.*/
     public void withdraw(double d) {
     if (d<=balance){
         balance-=d;
         System.out.println("Your balance after the transaction "+balance);
     }else System.out.println("Insufficient Balance");
     }
 }
