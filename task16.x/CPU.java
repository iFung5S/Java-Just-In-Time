public class CPU extends StockItem
{
  // Constructor.
  public CPU(int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredPriceExVat, requiredQuantityInStock);
  } // CPU

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "CPU";
  } // getStockType

  // Returns the decription of the stock item.
  public String getDescription()
  {
    return "Really fast";
  } // getDescription

} // class CPU
