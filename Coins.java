public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  public static void coinConverter(int x){

    System.out.println("Dollar bills: " + x / 100);
    x %= 100;
    System.out.println("Quarters: " + x / 25 );
    x %= 25;
    System.out.println("Dimes: " + x / 10);
    x %= 10;
    System.out.println("Nickels: " + x / 5);
    x %= 5;
    System.out.println("Pennies: " + x);
  }

  // write code for coinConverter

}
