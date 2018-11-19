import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		System.out.println("I will ask you ten numbers, enter the first one");
		Scanner sc = new Scanner(System.in);
		boolean finished = false;
		while (finished == false) {
			int[] enteredNumbersArray = new int[10];
			int enteredNumbersCounter=0;
			while (enteredNumbersCounter<10) {
				if (sc.hasNextInt()) {
					String entered = sc.nextLine();
					String[] enteredNumbers = entered.split(" ");
					if (enteredNumbers.length==1) {
						if (Integer.parseInt(enteredNumbers[0])>0) {
							enteredNumbersArray[enteredNumbersCounter]=Integer.parseInt(enteredNumbers[0]);
							enteredNumbersCounter++;
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
			for (int i=0;i<enteredNumbersArray.length;i++) {
				ArrayList<Integer> dividers = new ArrayList<Integer>();
				int j=2;
				while (j<=enteredNumbersArray[i]) {
					if (enteredNumbersArray[i]%j==0) {
						dividers
					}
					j++;
				}
				System.out.println(enteredNumbersArray[i]);
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
		sc.close();
	}
}
