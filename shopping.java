class Shopping
  {
  public static void main(String[] args) {
   String firstpurchase = "Underarm deodorant";
    String secpurchase = "Body powder";
    String thirdpurchase = "Scented Lotion";

    double firstprice = 13.99;
    double secprice = 27.99;
    double thirdprice = 39.99;

    System.out.println("Mrs Nkosi bought the following for her daughter Bongi:");
  System.out.println("\nHer first purchase was " + firstpurchase + " which cost R" + firstprice + ".");
    System.out.println("Her second purchase was " + secpurchase + " which cost R" + secprice + ".");
    System.out.println("Her third purchase was " + thirdpurchase + " which cost R" + thirdprice + ".");

    System.out.println("\nIn total, she paid R" + (firstprice + secprice + thirdprice));
  }
}