public class ReliableHardDisc extends HardDisc
{
  // Guarantee period in years
  private final int guaranteePeriod;

  // Constructor.
  public ReliableHardDisc(int requiredSize, int requiredGuaranteePeriod,
                  int requiredPriceExVat, int requiredQuantityInStock)
  {
    super(requiredSize, requiredPriceExVat, requiredQuantityInStock);
    guaranteePeriod = requiredGuaranteePeriod;
  } // ReliableHardDisc

  // Returns the stock type of the stock item.
  public String getStockType()
  {
    return "Reliable hard disc";
  } // getStockType

  // Returns the decription of the stock item.
  public String getDescription()
  {
    return super.getDescription() + ", guaranteed " + guaranteePeriod + " years";
  } // getDescription

} // class ReliableHardDisc
