// Create some Catalogue, increase their stock, sell some,
// and change the price, whilst printing them out.
public class TestCatalogue
{
  public static void main (String[] args)
  {
    System.out.println("Create catalogue 1 at 499 each, 10 in stock.");
    Catalogue item1 = new Catalogue(499,10);
    System.out.println(item1);

    System.out.println("Add 10 more catalogue 1");
    item1.increaseStock(10);
    System.out.println(item1);

    System.out.println("Sell 5 catalogue 1.");
    item1.sellStock(5);
    System.out.println(item1);

    System.out.println("Change price of catalogue 1 to 399.");
    item1.setPriceExVat(399);
    System.out.println(item1);
  } // main
} // class TestCatalogue
