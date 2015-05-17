public class Keyboard extends StockItem
{
  // Constructor.
  public Keyboard(int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredPriceExVat, requiredQuantityInStock);
  } // Keyboard

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Keyboard";
  } // getStockType

  // Returns the decription of the stock item.
  public String getDescription()
  {
    return "Cream, non-click";
  } // getDescription

} // class CPU
