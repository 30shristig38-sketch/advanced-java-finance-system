public class Expense extends Transaction{
  public Expense(String description, double amount, String category)
  {
    super(description, amount, category);
  }

  @Override
  public String getType()
  {
    return "EXPENSE";
  }

  @Override public String toString()
  {
  return String.format("[EXPENSE]  %-20s | -$%-8.2f | Category: %s", decription, amount, category);
  }
}
