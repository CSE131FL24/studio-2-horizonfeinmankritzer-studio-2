package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int startAmount;
	int finishAmount;
	double winChance;
	int winLimit;
	int totalSimulations;
	double win;
	int counter = 0;
	System.out.println("How much money are you starting with (in dollars)?");
	startAmount = in.nextInt();
	System.out.println("What is the win chance on your game of choice as a decimal?");
	winChance = in.nextDouble();
	System.out.println("What is your win limit rounded to the nearest dollar?");
	winLimit = in.nextInt();
	System.out.println("How many days do you want to play?");
	totalSimulations = in.nextInt();
	
	
	for (int i = 0; i < totalSimulations; i++) {
		finishAmount = startAmount;
		while (finishAmount>0 && finishAmount<winLimit) {
			win = Math.random();
			if (win<=winChance){
				finishAmount++;
			}
			else {
				finishAmount--;
			}
			counter ++;
		}
		System.out.println("Day " + (i+1));
		System.out.println("Number of Plays: " + counter);
			if (finishAmount!=0) {
				System.out.println("Day Result: Success");
			}
			else {
				System.out.println("Day Result: Ruin");
			}

		}

	}
}
