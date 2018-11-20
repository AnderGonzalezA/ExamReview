import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		System.out.println("Please, enter a positive number.");
		Scanner sc = new Scanner(System.in);
		boolean finished = false;
		while (finished == false){
			if (sc.hasNextInt()) {
				String entered = sc.nextLine();
				String[] enteredNumbers = entered.split(" ");
				if (enteredNumbers.length==1) {
					if (Integer.parseInt(enteredNumbers[0])>0) {
						for (int indexHeight = 0;indexHeight<Integer.parseInt(enteredNumbers[0]);indexHeight++) {
							for (int indexWeight = 0;indexWeight<=indexHeight;indexWeight++) {
								System.out.print("*");
							}
							System.out.println();
						}
						System.out.println("Would you like to enter another number?(y/n)");
						boolean answered = false;
						while (!answered) {
							String enteredAnswer = sc.nextLine();
							String[] enteredTokens= enteredAnswer.split(" ");
							if (enteredTokens.length==1) {
								switch (enteredTokens[0]) {
									case "y":
										answered=true;
										System.out.println("Please, enter a positive number.");
										break;
									case "n":
										answered=true;
										finished=true;
										break;
									default:
										System.out.println("Please, enter a possible value(y/n).");
										break;
								}
							}
							else {
								System.out.println("Please, enter just a possible value(y/n).");
							}
						}
					}
					else {
						System.out.println("Please, enter a positive number.");
					}
				}
				else {
					System.out.println("Please, enter just a number.");
				}
			}
			else {
				System.out.println("Please, enter a positive number.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}