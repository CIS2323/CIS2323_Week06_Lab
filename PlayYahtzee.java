import Yahtzee.*;
import java.util.Scanner;

public class PlayYahtzee {
	public static void main(String[] args){
		Yahtzee game = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char cont = 'y';
		
		while(cont != 'q'){
			System.out.println("****************************");
			System.out.println("       You rolled a:");
			System.out.println("     " + game.toss());
			System.out.println(" ");
			System.out.println(" What do you want to do?");
			System.out.println("    t) Toss your dice");
			System.out.println("    q) Quit game");
			System.out.println("*****************************");
			System.out.print(" Choose an option: ");
			cont = iDevice.next().charAt(0);
			iDevice.nextLine();
		}
	}
}