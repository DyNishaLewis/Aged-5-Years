import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    String name;
      Scanner scan = new Scanner(System.in);
      int age, addition; 
       System.out.println("Hello!!! What is your name?:");
       
      name = scan.nextLine();
      System.out.println("Hi! "+ name + " How old are you?");
      age = scan.nextInt();

      System.out.println("Did you know in 5 years you'll be " + (age + 5) );
      System.out.println("And 5 years ago you were " + (age - 5) );
      System.out.println("Imagine That!");
      addition = scan.nextInt();  
     
  }
}