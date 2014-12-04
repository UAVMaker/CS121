//************************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//************************************************************
import java.util.Scanner;
public class TestAccounts1
{
	public static void main(String[] args)
	{
		Account account1, account2, account3;
		String acct1, acct2, acct3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name on the First account: "); 
		acct1 = scan.next();
		System.out.println("Enter the name on the Second account: "); 
		acct2 = scan.next();
		System.out.println("Enter the name on the Third account: "); 
		acct3 = scan.next();
		account1 = new Account(100, acct1);
		account2 = new Account(100, acct2);
		account3 = new Account(100, acct3);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account3.toString());
		
		account1.close();
		Account account4 = Account.consolidate(account2, account3);
		System.out.println(account4.toString());
		
	}
}