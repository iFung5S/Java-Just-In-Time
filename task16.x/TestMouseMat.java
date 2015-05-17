// Create some MouseMat, increase their stock, sell some,
// and change the price, whilst printing them out.
public class TestMouseMat
{
  public static void main (String[] args)
  {
    System.out.println("Create mouse mat 1 at 499 each, 10 in stock.");
    MouseMat item1 = new MouseMat(499,10);
    System.out.println(item1);

    System.out.println("Add 10 more mouse mat 1");
    item1.increaseStock(10);
    System.out.println(item1);

    System.out.println("Sell 5 mouse mat 1.");
    item1.sellStock(5);
    System.out.println(item1);

    System.out.println("Change price of mouse mat 1 to 399.");
    item1.setPriceExVat(399);
    System.out.println(item1);
  } // main
} // class TestMouseMat
