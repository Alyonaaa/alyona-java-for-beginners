package coffeemachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The coffee machine has:");
        System.out.print("400 ml of water\n" + "540 ml of milk\n" + "120 g of coffee beans\n" + "9 disposable cups\n" + "$550 of money ");
        System.out.println(" ");
        String buy = "buy";
        String fill = "fill";
        String take = "take";
        String espresso = "1";
        String latte = "2";
        String cappuccino = "3";
        int allwater = 400;
        int allmilk = 540;
        int allcoffeebeans = 120;
        int allcups = 9;
        int allmoney = 550;
        int esprwater = 250;
        int esprcoffeebeans = 16;
        int esprmoney = 4;
        int cups = 1;
        System.out.println("Write action" + "("+ buy +","+ fill + "," + take + "):");
        String choice = scan.next();
        if ( choice.equals(buy)){
            System.out.println("What do you want to buy? "+ espresso + " - espresso, " + latte + " - latte, " + cappuccino + "- cappuccino:" + ":" );
        }
        String choice2 = scan.next();
        if (choice2.equals(espresso)) {
            allwater  -= esprwater;
//            int resultwater = allwater - esprwater;
            int resultcof = allcoffeebeans - esprcoffeebeans;
            int resultcups = allcups- cups;
            int resultmoney = allmoney - esprmoney;
            System.out.println("The coffee machine has:");
            System.out.println(allmilk + "ml of milk");
            System.out.println(resultcof + " g of coffee beans ");
            System.out.println(resultcups + " disposable cups");
            System.out.println("$ " + resultmoney + "of money");

        }
        int latwater = 350;
        int latmilk = 75;
        int latcoffeebeans = 20;
        int latmoney = 7;
        if (choice2.equals(latte)) {
            allwater -= latwater;
            int resultcof2 = allcoffeebeans - latcoffeebeans;
            int resultcups2 = allcups- cups;
            int resultmoney2 = allmoney - latmoney;
            int resultmilk2 = allmilk - latmilk;
            System.out.println("The coffee machine has:");
            System.out.println(resultmilk2 + "ml of milk");
            System.out.println(resultcof2 + " g of coffee beans ");
            System.out.println(resultcups2 + " disposable cups");
            System.out.println("$ " + resultmoney2 + "of money");

        }

        System.out.println(allwater + " "+" ml of water ");

    }

}
