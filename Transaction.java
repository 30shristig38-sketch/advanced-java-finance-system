public abstract class Transaction{
  protected String description;
  protected double amount;
  protected String category;
  
  public abstract String getType();

  //Constructor
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
}
