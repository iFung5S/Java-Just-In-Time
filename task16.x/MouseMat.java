public class MouseMat extends TextDescriptionStockItem
{
  // Constructor.
  public MouseMat(String requiredDescription, int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredDescription, requiredPriceExVat, requiredQuantityInStock);
  } // MouseMat

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Mouse mat";
  } // getStockType

} // class MouseMat
