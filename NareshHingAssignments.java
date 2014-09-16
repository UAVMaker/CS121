package assignments;



import java.util.Scanner;


/*PP 2.3 Write an application that prompts for and reads a person’s name,
age, college, and pet’s name. Then print the following paragraph,
inserting the appropriate data:
Hello, my name is name and I am age years
old. I’m enjoying my time at college, though
I miss my pet petname very much! 

PP 2.7 Write an application that prompts for and reads integer values
for speed and distance traveled, then prints the time required for
the trip as a floating point result.
*/
/**
 *
 * @author Naresh
 */
public class NareshHingAssignments {
  static Scanner scan = new Scanner(System.in); 
static String name, college, petName; 
static int age, task; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

System.out.println("Which program would you like to use?");
System.out.println("Enter 1 for PP2.3     \nenter 2 for PP2.7     ");
task = Integer.parseInt(scan.nextLine());

if(task ==1){TASK1();}
else if(task ==2){TASK2();}
else{}

    
    }
    public static  void TASK1(){
        System.out.print("What is your name? "); 
name = scan.nextLine(); 
System.out.print("What is your age? "); 
age = Integer.parseInt(scan.nextLine());
System.out.print("What is your college? "); 
college = scan.nextLine(); 
System.out.print("What is your pet\'s name? "); 
petName = scan.nextLine(); 

System.out.println("Hello, my name is "+name +" and I am "+ age 
        +" years \nold. I\'m enjoying my time at "+college 
+", though \nI miss my pet "+petName+" very much!"); 
    
    }
   
    
    public static void TASK2(){
    System.out.println("Enter the distance you have traveled in miles?");
    int distance = Integer.parseInt(scan.nextLine());
    System.out.println("Enter the speed you traveled in mph?");
    int speed = Integer.parseInt(scan.nextLine());
    float time = (float)distance/speed;
    
    System.out.println("The time it took you to travel " +distance+" miles at a speed of "+speed+" mph is "+time+" hours.");
    }
}
