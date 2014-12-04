import java.util.Scanner;

public class StringEquals
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter First String");
      str2 = scan.next();
      System.out.println("Enter Second String");
      str3 = scan.next();
int num = str2.compareTo(str3);
	if(num >0 ){System.out.println("Str2 is greater than str3");}
	else if(num < 0){System.out.println("Str2 is less than str3");}
	else{System.out.println("Same");}
	
	scan.close();
   }
}
