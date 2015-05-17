// Create some differenc StockItem, increase their stock, sell some,
// and change the price, whilst printing them out.
public class TestStockItemSubclasses
{
  public static void main (String[] args)
  {
    StockItem[] stockItems =
    {
      new MouseMat("Black", 499, 10),
      new MouseMat("Blue", 399, 15),
      new Catalogue("Contains all items", 100, 100),
      new Book("Plain", 50, 20),
      new CPU(49999, 20),
      new Keyboard(999, 30),
      new HardDisc(1000, 3999, 50),
      new ReliableHardDisc(500, 20, 2999, 20)
    };

    for (StockItem stockItem : stockItems)
      testStockItem(stockItem);
  } // main

  private static void testStockItem(StockItem stockItem)
  {
    System.out.println("--------------------------------------------------------");
    System.out.println(stockItem);
    stockItem.increaseStock(5);
    System.out.println(stockItem);
    stockItem.sellStock(10);
    System.out.println(stockItem);
    stockItem.setPriceExVat(99);
    System.out.println(stockItem);
    if (stockItem instanceof TextDescriptionStockItem)
      testTextDescriptionStockItem((TextDescriptionStockItem) stockItem);
  } // testStockItem

  private static void testTextDescriptionStockItem(TextDescriptionStockItem textDescriptionStockItem)
  {
      textDescriptionStockItem.setDescription(textDescriptionStockItem.getDescription() + " and big");
      System.out.println(textDescriptionStockItem);
  } // testTextDescriptionStockItem

} // class TestStockItemSubclasses
