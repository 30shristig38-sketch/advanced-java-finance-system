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

    BudgetTracker tracker = new BudgetTracker(limit);
    boolean running = true;

    while(running){
      System.out.println("\n--- OBJECT-ORINETED FINANCE MANAGER ---");
      System.out.println("1. Add Income");
      System.out.println("2. Add Expense");
      System.out.println("3. View All Transactions");
      System.out.println("4. View Financial Summary");
      System.out.println("5. Export Data to CSV File");
      System.out.println("6. Exit");
      System.out.print("Choose an Option (1-6): ");
    }
  }
}
