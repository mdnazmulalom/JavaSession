package pciu.cse011.helloworld.javasession;

import java.sql.SQLOutput;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        //System.out.println("new system to print java program");
    /*    //System.out.println("nazmul");
        int number = 20;
        System.out.println(number);
        double desimalnumber = 5.9;
        System.out.println(desimalnumber);
        float floatNumber = (float) 5.9;
        System.out.println(floatNumber);



        char character = '\u00A9';//this is for copy right symbol
        System.out.println(character);

        String name = "Nazmu Alom";//string
        System.out.println(name);

        boolean Boolean = true;
        System.out.println(Boolean);



        // Arithmetic operation


       int  a = 50;
      int  b = 4;
      int ans = a % b;
        System.out.println("sum = "+ ans);  */

        // math for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total Product : ");
         int totalProduct = scanner.nextInt();
        System.out.println("buyprice : ");
        double buyprice = scanner.nextInt();
        System.out.println("Sellprice");
        double sellprice = scanner.nextInt();

        System.out.println("totalProduct = "+ totalProduct + "\n" + "Buy price = "+ buyprice +
                "\n" + "Sell price = "+ sellprice);
        double total_buy_price = totalProduct * buyprice;
        System.out.println("total Buy TurnOver : "+ total_buy_price);
        double sell_price = totalProduct * sellprice;

        System.out.println("sell TurnOver : " + sell_price);
        double profit = sell_price - total_buy_price;
        System.out.println("Total Profit !! = "+ profit);


       //conditional operation








    }
}
