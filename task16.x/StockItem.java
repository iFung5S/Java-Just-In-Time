public abstract class StockItem
{
  // The number of stock items created so far.
  private static int noOfStockItemsCreated = 0;

  // The fixed stock code of this item.
  private final int stockCode;

  // The price excluding VAT in pence.
  private int priceExVat;

  // The quantity in stock.
  private int quantityInStock;

  // Constructor.
  public StockItem(int initialPriceExVat, int initialQuantityInStock)
  {
    noOfStockItemsCreated++;
    stockCode = noOfStockItemsCreated;
    priceExVat = initialPriceExVat;
    quantityInStock = initialQuantityInStock;
  } // StockItem

  // Returns the stock code of the stock item.
  public int getStockCode()
  {
    return stockCode;
  } // getStockCode

  // Returns the stock type of the stock item.
  public abstract String getStockType();

  // Returns the decription of the stock item.
  public abstract String getDescription();

  // Returns the quantity of the stock item.
  public int getQuantityInStock()
  {
    return quantityInStock;
  } // getQuantityInStock

  // Increases the stock level by the given amount.
  public void increaseStock(int requiredAmount)
  {
    if (requiredAmount < 1)
      throw new IllegalArgumentException("Quantity must be positive.");
    else
      quantityInStock += requiredAmount;
  } // increaseStock

  // Attempts to reduce the stock level by the given amount.
  // Returns whether the reduction was successful.
  public boolean sellStock(int requiredAmount)
  {
    if (requiredAmount < 1)
      throw new IllegalArgumentException("Quantity must be positive.");
    if (requiredAmount <= quantityInStock)
    {
      quantityInStock -= requiredAmount;
      return true;
    } // if
    else
      return false;
  } // sellStock

  // Set the price of the item to the given price.
  public void setPriceExVat(int requiredPriceExVat)
  {
    priceExVat = requiredPriceExVat;
  } // setPriceExVat

  // Returns the price before VAT of this stock item.
  public int getPriceExVat()
  {
    return priceExVat;
  } // getPriceExVat

  // Returns the VAT rate
  public double getVatRate()
  {
    return 20.0;
  } // getVatRate

  // Returns the price including VAT rounded to the nearest penny
  public int getPriceIncVat()
  {
    return (int) Math.round(getPriceExVat() * (1 + getVatRate() / 100));
  } // getPriceIncVat

  // Returns a string giving the stock code, stock type, description,
  //  quantity, price before VAT and price after VAT.
  public String toString()
  {
    return "SC" + getStockCode() + ": " + getStockType() + ", " 
           + getDescription() + " (" + getQuantityInStock() + " @ "
           + getPriceExVat() + "p/" + getPriceIncVat() + "p)";
  } // toString

} // class StockItem
