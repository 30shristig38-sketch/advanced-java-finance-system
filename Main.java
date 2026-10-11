import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    double limit = 0.0;

    //Exception handling for user input validity
    while(true){
        try{
          System.out.print("Set your monthly expense busget limit ($): ")
          limit = Double.parseDouble(scanner.nextLine());
          break;
          }
        catch(NumberFormatException e){
            System.out.println("Inavlid input. Please enter a valid number");
          }
      }

    
  }
}
