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
  }
}


