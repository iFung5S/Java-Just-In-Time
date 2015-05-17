public class HardDisc extends StockItem
{
  // Size of HardDisc in GB
  private final int size;

  // Constructor.
  public HardDisc(int requiredSize, int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredPriceExVat, requiredQuantityInStock);
    size = requiredSize;
  } // HardDisc

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Hard disc";
  } // getStockType

  // Returns the decription of the stock item.
  public String getDescription()
  {
    return size + "GB of space";
  } // getDescription

} // class HardDisc
