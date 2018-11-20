import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		System.out.println("I will ask you ten different numbers, enter the first one");
		Scanner sc = new Scanner(System.in);
		boolean finished = false;
		while (finished == false) {
			ArrayList<Integer> enteredNumbersArrayList = new ArrayList<Integer>();
			while (enteredNumbersArrayList.size()<10) {
				if (sc.hasNextInt()) {
					String entered = sc.nextLine();
					String[] enteredNumbers = entered.split(" ");
					if (enteredNumbers.length==1) {
						if (Integer.parseInt(enteredNumbers[0])>0) {
							boolean repeated=false;
							for (int i=0;i<enteredNumbersArrayList.size();i++) {
								if (Integer.parseInt(enteredNumbers[0])==enteredNumbersArrayList.get(i)) {
									repeated=true;
									break;
								}
							}
							if (!repeated) {
								enteredNumbersArrayList.add(Integer.parseInt(enteredNumbers[0]));
							}
							else {
								System.out.println("You already entered that number, try it again.");
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
			System.out.println("The perfect numbers are: ");
			/*for (int i=0;i<enteredNumbersArrayList.size();i++) {
				ArrayList<Integer> dividers = new ArrayList<Integer>();
				for (int j=1;j<enteredNumbersArrayList.get(i);j++) {
					if (enteredNumbersArrayList.get(i)%j==0) {
						dividers.add(j);
					}
				}
				int sum=0;
				for (int k=0;k<dividers.size();k++) {
					sum=sum+dividers.get(k).intValue();
				}
				if (sum==enteredNumbersArrayList.get(i)) {
					System.out.println(enteredNumbersArrayList.get(i));
				}
			}*/
			for (int i=0;i<enteredNumbersArrayList.size();i++) {
				int sum=0;
				for (int j=1;j<enteredNumbersArrayList.get(i);j++) {
					if (enteredNumbersArrayList.get(i).intValue()%j==0) {
						sum=sum+j;
					}
				}
				if (sum==enteredNumbersArrayList.get(i)) {
					System.out.println(enteredNumbersArrayList.get(i));
				}
			}
			System.out.println("Would you like to enter more numbers?(y/n)");
			boolean answered = false;
			while (answered==false) {
				String enteredAnswer = sc.nextLine();
				String[] enteredTokens= enteredAnswer.split(" ");
				if (enteredTokens.length==1) {
					switch (enteredTokens[0]) {
						case "y":
							answered=true;
							System.out.println("I will ask you ten different numbers, enter the first one");
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
