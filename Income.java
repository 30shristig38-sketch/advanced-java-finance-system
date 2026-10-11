public class Income extends Transaction{
  public Income(String description, double amount, String category)
  {
    super(description, amount, category)
  }

  @Override
  public StringgetType()
  {
    return "INCOME";
  }

  @Override
  public String toString()
  {
    return String.format("[INCOME]   %-20s | +$%-8.2f | Category: %s", description, amount, category);
  }
}
