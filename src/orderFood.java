package rest;

import java.util.Scanner;

public class orderFood {
    public static double new_balance;
    public static boolean happy;
    public static void food() {
        new_balance = restaurant.returner();
        restaurant.sleep(1500);
        restaurant.dump("*at the counter*");
        restaurant.sleep(1500);
        restaurant.dump("What would you like to order? (1-6) Just say when your done so we can total your order!");

        seeMenu.items();
        Scanner s = new Scanner(System.in);
        System.out.print("> ");
        String response = "";
        double total = 0;
        boolean check = false;

        while (!check) {
            System.out.print("> ");
            response = s.nextLine();
            if (response.toLowerCase().equals("1")) {
                if (new_balance >= 299.99) {
                    total = total + 299.99;
                    new_balance = new_balance - 299.99;
                    restaurant.dump("x1 Corrupted Chicken Casserole");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().equals("2")) {
                if (new_balance >= 109.99) {
                    total = total + 109.99;
                    new_balance = new_balance - 109.99;
                    restaurant.dump("x1 Suspicious Shrimp Scampi");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().equals("3")) {
                if (new_balance >= 299.99) {
                    total = total + 299.99;
                    new_balance = new_balance - 299.99;
                    restaurant.dump("x1 Terrible Turkey Tenderloin");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().equals("4")) {
                if (new_balance >= 79.99) {
                    total = total + 79.99;
                    new_balance = new_balance - 79.99;
                    restaurant.dump("x1 Sweet Swedish Sandwich");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().equals("5")) {
                if (new_balance >= 199.99) {
                    total = total + 199.99;
                    new_balance = new_balance - 199.99;
                    restaurant.dump("x1 Gross Gingerbread");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().equals("6")) {
                if (new_balance >= 69.99) {
                    total = total + 69.99;
                    new_balance = new_balance - 69.99;
                    restaurant.dump("x1 Goopy Green Gelato");
                }
                else {
                    ending();
                }
            }
            else if (response.toLowerCase().contains("done")) {
                double roundTotal = Math.round(total*100.0)/100.0;
                restaurant.dump("Your total is " + roundTotal);
                if (total > 500) {
                    happy = true;
                }
                restaurant.sleep(1500);
                restaurant.dump("*at the front*");
                check = true;


            }
            else {
                if (response.trim().isEmpty()) {
                }
                else {
                    restaurant.dump("'" + response + "' is not a valid response");
                }
            }
        }

    }
    public static void ending() {
        restaurant.dump(".....");
        restaurant.sleep(2000);
        restaurant.dump("*gasp*");
        restaurant.sleep(2000);
        restaurant.dump("You don't have enough money. You filthy poor person!");
    }
    public static boolean happiness() {
        return happy;
    }
}
