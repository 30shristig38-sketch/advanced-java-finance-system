import java.util.*;
import java.io.*;

public class BudgetTracker{
  private ArrayList<Transaction> transactions;
  private double budgetLimit;

  public BudgetTracker(double budgetLimit)
  {
    this.transaction = new ArrayList<>();
    this.budgetLimit = budgetLimit;
  }

  public void addTransaction(Transaction t)
  {
    transactions.add(t);
  }

  public double calculateTotalIncome()
  {
    double total = 0;
    for(Transaction t: transactions)
      {
        if(t instanceof Income)
        {
          total += t.getAmount()
        }
      }
    return total;
  }

  public double calculateTotalExpenses()
  {
    double total = 0;
    for(Transaction t : transactions)
      {
        if(t instanceof Expense)
        {
          total += t.getAmount();
        }
      }
  }

  public void displaySummary()
  {
    double income = calculateTotalIncome();
    double expenses = calculateTotalExpenses();
    double net = income - expenses;

    System.out.println("\n--- FINANCIAL SUMMARY ---");
    System.out.println("Total Income:   $" + String.format("%.2f", income));
    System.out.println("Total Expenses: $" + String.format("%.2f", expenses));
    System.out.println("Net Balance:    $" + String.format("%.2f", net));

    if(expenses > budgetLimit)
    {
      System.out.println("ALERT: You have exceeded your expense budget limit of $" + budgetLimit);
    }
    else
    {
      System.out.println("You're all good! Remaining Budgest: $" + String.format("%.2f", budgetLimit=expenses));
    }
  }

  
}








