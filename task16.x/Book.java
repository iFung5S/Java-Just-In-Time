public class Book extends TextDescriptionStockItem
{
  // Constructor.
  public Book(String requiredDescription, int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredDescription, requiredPriceExVat, requiredQuantityInStock);
  } // Book

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Book";
  } // getStockType

  // Returns the VAT rate
  public double getVatRate()
  {
    return 0;
  } // getVatRate 

} // class Book
