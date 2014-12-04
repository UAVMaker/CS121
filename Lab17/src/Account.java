//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts =0; 
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    numAccounts++;
  }

  //----------------------------------------------
  //Constructor -- initializes balance and owner; generates random
  //account number
  //----------------------------------------------
  public Account(double initBal, String owner)
  {
    balance = initBal;
    name = owner;
    acctNum = (int) (Math.random() * Integer.MAX_VALUE);
    numAccounts++;
  }

  //----------------------------------------------
  //Constructor -- initializes owner as given and balance to 0.  
  //Generates random account number
  //----------------------------------------------
  public Account(String owner)
  {
    balance = 0;
    name = owner;
    acctNum = (int) (Math.random() * Integer.MAX_VALUE);
    numAccounts++;
    
    
  }
  
  public static Account consolidate(Account acct1, Account acct2){
	  if(acct1.name.equals(acct2.name)){System.out.println("Names Match on these Accounts");
	  return null;}
	  else if(acct1.acctNum == acct2.acctNum){System.out.println("Account Numbers Matched");
	  return null;}
	  else{
	  double bal = acct1.balance + acct2.balance;
	  acct1.close();
	  numAccounts --;
	  acct2.close();
	  numAccounts --;
	 return new Account(bal, acct1.name);}
	 
  }
  
  public static int getNumAccounts(){
	  return numAccounts;
  }
  
  public void close(){
	  System.out.println("CLOSED");
	  numAccounts--;
	  balance =0;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // Also deducts fee from account.
  //----------------------------------------------
  public void withdraw(double amount, double fee)
  {
    if (balance >= amount)
	{
	    balance -= amount;
	    balance -= fee;
	}
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Returns a string containing the name, acct number, and balance.
  //----------------------------------------------
    public String toString()
    {
	return "Name: " + name + 
	    "\nAcct #: " + acctNum + 
	    "\nBalance: " + balance;
    }
}