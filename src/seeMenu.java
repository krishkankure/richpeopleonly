package rest;

public class seeMenu {
    public static String[] menu ={"Corrupted Chicken Casserole", "Suspicious Shrimp Scampi", "Terrible Turkey Tenderloin", "Sweet Swedish Sandwich", "Gross Gingerbread", "Goopy Green Gelato"};

    public static void menu() {
        restaurant.dump("Here at RichPeopleOnly we have a small, but delicious range of options at unreasonable prices!");
        restaurant.sleep(1500);
        restaurant.dump("Here is our menu");
        restaurant.sleep(1000);
        System.out.println(" ");
        System.out.println(" ");
        items();
    }
    public static void items() {
        System.out.println("MENU");
        System.out.println(" ");
        System.out.println("<1> " + menu[0] + "- $299.99"); //chicken is $299.99
        System.out.println("<2> " + menu[1] + "- $109.99"); //scampi is $109.99
        System.out.println("<3> " + menu[2] + "- $299.99"); //turkey is $299.99
        System.out.println("<4> " + menu[3] + "- $79.99"); //sandwich is $79.99
        System.out.println("<5> " + menu[4] + "- $199.99"); //gingerbread is $199.99
        System.out.println("<6> " + menu[5] + "- $69.99"); //gelato is $69.99
        System.out.println(" ");
    }
}
