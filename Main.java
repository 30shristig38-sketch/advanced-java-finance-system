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

      String choice = s.nextLine();

      switch(choice){
        case "1":
        case "2":
          boolean isIncome = choice.equals("1");
          System.out.print("Enter description: ");
          String desc = s.nextLine();

          double amt = 0
          while(true){
            try{
              System.out.print("Enter amount ($): ");
              amt = Double.parseDouble(s.nextLine());
              break;
            } catch(NumberFormatException e){
              System.out.println("Invalid amount. Please enter a number.");
            }
          }

          System.out.print("Enter category (i.e.: Salary, Food, Utilities): ");
          String cat = s.nextLine();

          if(isIncome){
            tracker.addTransaction(new Income(desc, amt, cat));
          } else{
            tracker.addTransaction(new Expense(desc, amt, cat));
          }
          System.out.println("Transaction added successfully!");
          break;

        case "3":
          tracker.displayALLTransactions();
          break;

        case "4":
          tracker.displaySummary();
          break;

        case "5":
          tracker.exportToFile("financial_report.csv");
          break;

        case "6":
          running = false;
          System.out.println("Exiting application. Goodbye!");
          break;

        default:
          System.out.println("Invalid choice. Please choose a whole number between 1 and 6.");
      }
    }
    scanner.close();    
  }
}
