package d30JavaPractice.C08_Bank;

public class C08_BankAccountRunner {
    public static void main(String[] args) {
        /* In the main method, create an instance of the "BankAccount" class, set the account number
        and initial balance, and test the deposit and withdraw methods.*/

        C08_BankAccount bnkAkk=new C08_BankAccount();
        bnkAkk.setAccountNumber("123456789");
        bnkAkk.setBalance(1000);
        System.out.println("Your AccountNumber is "+bnkAkk.getAccountNumber()+" Your Balance is "+bnkAkk.getBalance());

        bnkAkk.deposit(500);

        bnkAkk.withdraw(2000);








       //C08_BankAccount bos=new C08_BankAccount();
       //System.out.println("bos.getBalance() = " + bos.getBalance());


    }





}
