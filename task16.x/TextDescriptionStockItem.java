public abstract class TextDescriptionStockItem extends StockItem
{
  // The description.
  private String description;

  // Constructor.
  public TextDescriptionStockItem(String requiredDescription, int initialPriceExVat, int initialQuantityInStock)
  {
    super(initialPriceExVat, initialQuantityInStock);
    description = requiredDescription;
  } // TextDescriptionStockItem

  // Returns the description.
  public String getDescription()
  {
    return description;
  } // getDescription

  // Sets the description.
  public void setDescription(String requiredDescription)
  {
    description = requiredDescription;
  } // setDescription

} // class TextDescriptionStockItem
