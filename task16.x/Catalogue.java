public class Catalogue extends Book
{
  // Constructor.
  public Catalogue(String requiredDescription, int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredDescription, requiredPriceExVat, requiredQuantityInStock);
  } // Catalogue

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Catalogue";
  } // getStockType

} // class Catalogue
