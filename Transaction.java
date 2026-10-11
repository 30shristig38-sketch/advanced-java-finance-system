public abstract class Transaction{
  protected String description;
  protected double amount;
  protected String category;
  
  public abstract String getType();

  public Transaction(String description, double amount, String category)
  {
    this.description = description;
    this.amount = amount;
    this.category = category;
  }

  
  public double getAmount()
  {
    return amount;
  }
  public String getDescription()
  {
    return description;
  }
  public String getCategory()
  {
    return category;
  }

  @Override
  public abstract String toString();
}
