// Create some stock items, increase their stock, sell some,
// and change the price, whilst printing them out.
public class TestStockItem
{
  public static void main (String[] args)
  {
    System.out.println("Create item 1 at 499 each, 10 in stock.");
    StockItem item1 = new StockItem(499,10);
    System.out.println(item1);
    System.out.println("Create item 2 at 9999 each, 20 in stock.");
    StockItem item2 = new StockItem(9999,20);
    System.out.println(item2);

    System.out.println("Add 10 more item 1");
    item1.increaseStock(10);
    System.out.println(item1);

    System.out.println("Add 20 more item 2");
    item2.increaseStock(20);
    System.out.println(item2);

    System.out.println("Sell 5 item 1.");
    item1.sellStock(5);
    System.out.println(item1);

    System.out.println("Sell 10 item 2.");
    item2.sellStock(10);
    System.out.println(item2);

    System.out.println("Change price of item 1 to 399.");
    item1.setPriceExVat(399);
    System.out.println(item1);

    System.out.println("Change price of item 2 to 7999.");
    item2.setPriceExVat(7999);
    System.out.println(item2);
  } // main
} // class TestStockItem
