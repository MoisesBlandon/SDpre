import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //int selection;

    Boolean MenuLoop = true;
    while(MenuLoop){ 
      printMenu(); 
      int selection = scanner.nextInt();

    

        if( selection == 1) {
          System.out.println( "Hello Human");
        }

        else if(selection == 2){
          System.out.println("Tacos and Pizza");
        }

        else {
          System.out.println("Goodbye");
          MenuLoop = false; }





      /*
      Your solution goes here
      */
      
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();

    


    
     

    
    }









}
