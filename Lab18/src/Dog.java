//Created by James Vanderhyde, 12 April 2011
// Copied from Horstmann Lab Manual

public class Dog implements Speakable
{
   private String name;

   public Dog(String name)
   {
      this.name = name;
   }

   public String toString()
   {
      return "Dog:  " + name;
   }


public void speak() {
System.out.println("Woof! Woof!");
	
}
}