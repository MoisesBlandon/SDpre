import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

   // int num1 = 0, num2 = 0, num3 = 0;
   // double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add."); 
    int num2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add."); 
    int num3 = keyboard.nextInt();

    


    System.out.println ("Please enter the first decimal number you would like to add.");
    Double dub1 = keyboard.nextDouble();

    System.out.println ("Please enter the second decimal number you would like to add.");
    Double dub2 = keyboard.nextDouble();

    System.out.println ("Please enter the third decimal number you would like to add.");   
    Double dub3 = keyboard.nextDouble();


    int sum = num1 + num2 + num3;
    double dubsum = dub1 + dub2 + dub3;

    System.out.println ("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum + ".");
    System.out.println ("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubsum + ".");
    keyboard.close();





  }
}
