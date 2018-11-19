import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Please, enter a positive number.");
		Scanner sc = new Scanner(System.in);
		boolean finished=false;
		while (finished==false) {
			if (sc.hasNextInt()){
				String entered = sc.nextLine();
				String[] enteredNumbers=entered.split(" ");
				if (enteredNumbers.length==1) {
					if (Integer.parseInt(enteredNumbers[0])>0) {
						boolean compositeFound = false;
						int index=Integer.parseInt(enteredNumbers[0])-1;
						while (index>1 && compositeFound==false) {
							if(Integer.parseInt(enteredNumbers[0]) % index == 0) {
								compositeFound=true;
							}
							index--;
						}
						if (compositeFound==false) {
							System.out.println("The number give is prime.");
						}
						else {
							System.out.println("The number given is composite.");
						}
						System.out.println("Would you like to enter another number?(y/n)");
						boolean answered = false;
						while (answered==false) {
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
						System.out.println("Please, enter a positive number");
					}
				}
				else {
					System.out.println("Please, enter just a number");
				}
			}
			else {
				System.out.println("Please, enter a number.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
