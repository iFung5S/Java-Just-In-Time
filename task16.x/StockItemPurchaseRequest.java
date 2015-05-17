public class StockItemPurchaseRequest
{
  // The StockItem
  private final StockItem stockItem;

  // Quantity required by customer
  private final int quantity;

  // Constructor
  public StockItemPurchaseRequest(StockItem requiredStockItem, int requiredQuantity)
  {
    stockItem = requiredStockItem;
    quantity = requiredQuantity;
  } // StockItemPurchaseRequest

  public StockItem getStockItem()
  {
    return stockItem;
  } // getStockItem

  public int getQuantity()
  {
    return quantity;
  } // getQuantity

  public int getQuantityInStock()
  {
    return stockItem.getQuantityInStock();
  } // getQuantityInStock()

  public String toString()
  {
    return getQuantity() + " of " + stockItem.toString();
  } // toString

} // StockItemPurchaseRequest
