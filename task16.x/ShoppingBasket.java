public class ShoppingBasket
{
  private StockItemPurchaseRequest[] stockItems;

  private int noOfStockItemPurchaseRequests;

  public ShoppingBasket()
  {
    noOfStockItemPurchaseRequests = 0;
    stockItems = new StockItemPurchaseRequest[INITIAL_ARRAY_SIZE];
  } // ShoppingBasket

  public void add(StockItem stockItem, int requiredQuantity)
  {
    StockItemPurchaseRequest stockItemPurchaseRequest
      = new StockItemPurchaseRequest(stockItem, requiredQuantity);
    if (arrayIsFull(stockItems))
      stockItems = expandArray(stockItems);
    stockItems[noOfStockItemPurchaseRequests] = stockItemPurchaseRequest;
    noOfStockItemPurchaseRequests++;
  } // add

  public String checkout()
  {
    String returnString = "Check report:\n";
    int priceExVat = 0;
    int priceIncVat = 0;
    ShoppingBasket notPurchased = new ShoppingBasket();
    for (StockItemPurchaseRequest stockItem : stockItems)
    {
      if (stockItem != null)
      {
        if (stockItem.getStockItem().sellStock(stockItem.getQuantity()))
        {
          returnString += "Purchased " + stockItem + "\n";
          priceExVat += stockItem.getStockItem().getPriceExVat() * stockItem.getQuantity();
          priceIncVat += stockItem.getStockItem().getPriceIncVat() * stockItem.getQuantity();
        } // if
        else
        {
          returnString += "Not purchased " + stockItem + "\n";
          notPurchased.add(stockItem.getStockItem(), stockItem.getQuantity());
        } // else
      } // if
    } // for

    for (int index = 0; index < stockItems.length; index++)
      stockItems[index] = null;

    for (int index = 0; index < notPurchased.noOfStockItemPurchaseRequests; index++)
      stockItems[index] = notPurchased.stockItems[index];

    returnString += "Total price ex VAT: " + priceExVat + "p\n";
    returnString += "Total price inc VAT: " + priceIncVat + "p\n";
    return returnString;
  } // checkout

  public String toString()
  {
    String theString = "Shopping basket:\n";
    for (StockItemPurchaseRequest stockItem : stockItems)
      if (stockItem != null)
        theString += stockItem + "\n";
    return theString;
  } // toString

  private static final int INITIAL_ARRAY_SIZE = 1;
  private static final int ARRAY_RESIZE_FACTOR = 2;

  private StockItemPurchaseRequest[] expandArray(StockItemPurchaseRequest[] smallerArray)
  {
    StockItemPurchaseRequest[] biggerArray 
      = new StockItemPurchaseRequest[smallerArray.length * ARRAY_RESIZE_FACTOR];
    for (int index = 0; index < smallerArray.length; index++)
      biggerArray[index] = smallerArray[index];
    return biggerArray;
  } // expandArray

  private boolean arrayIsFull(StockItemPurchaseRequest[] anArray)
  {
    return noOfStockItemPurchaseRequests >= anArray.length;
  } // arrayStillNotFull

  private boolean isEnough(StockItemPurchaseRequest stockItem)
  {
    return stockItem.getQuantityInStock() >= stockItem.getQuantity();
  } // StockItemPurchaseRequest

} // class ShoppingBasket
