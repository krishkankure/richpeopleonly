package rest;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
public class restaurant {
	public static double balance = 234341;
	public static void start() {
		sleep(1500);
		dump("Welcome to RichPeopleOnly, A restaurant exclusively for rich people.");
		
		sleep(1500);
		dump("Here at restaurant we don't take a response other than numbers");
		sleep(1500);
		dump("You can");
		sleep(100);
		dump("<1> Check Wallet");
		dump("<2> See Menu");
		dump("<3> Order food");
		dump("<4> Leave");
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("> ");
		String response = "";
		
		boolean check = false;
		while (!check) {
			System.out.print("> ");
			response = s.nextLine();
			if (response.toLowerCase().equals("1")) {
				checkWallet.wallet();
			}			
			else if (response.toLowerCase().equals("2")) {
				seeMenu.menu();
			}
			else if (response.toLowerCase().equals("3")) {
				orderFood.food();
			}
			
			else if (response.toLowerCase().equals("4")) {
				if (orderFood.happiness()) {
					dump("Thank you for dining at RichPeopleOnly, please come again :)");
					System.exit(0);
				}
				else {
					dump("Get out of here you poor scum.");
					System.exit(0);
				}

			}

			else {
				if (response.trim().isEmpty()) {
				}
				else {
					dump("What does '" + response + "' mean?");
				}
			}
		}	
	}			
	public static String dump(String input){
		String text = input;
		int i;
		for(i = 0; i < text.length(); i++){
			System.out.printf("%c", text.charAt(i));
			try{
				Thread.sleep(25);//0.5s pause between characters
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(" ");
		return input;
	}
	public static void sleep(int num) {
		try {
			Thread.sleep(num);
		}
		catch(InterruptedException ex) {
			System.out.println("2312");
			Thread.currentThread().interrupt();
			System.out.println("2312");
		}				
	}
	public static double returner() {

		return balance;
	}

}