
import java.util.Scanner;
//Met de Scanner class kan je de gebruiker een input laten geven.
//Dit maakt de code interessanter.

public class ifelse_Terminal {
	public static void main(String[] args) {
		//      ### Benaming is vergelijkbaar met function Myfunction. Dit object kunnen we hergebruiken
		Scanner scanner = new Scanner(System.in);

		performEvenOddCheck(scanner);
		performECTSGrading(scanner);
		checkBiggestNumber(scanner);
		checkPosNeg(scanner);
		checkAge(scanner);
		checkTextLength(scanner);
		checkLeapYear(scanner);
		checkBiggestNumberOfThree(scanner);
		checkTriangleType(scanner);
		makeCalculation(scanner);
		scanner.close();
	}


	// Opdracht 1: Methode voor Even/Odd Checker

	public static void performEvenOddCheck(Scanner scanner) {
		System.out.print("Voer een geheel getal in voor even/oneven check: ");
		int number = getNumberInput(scanner, false);
		if (number % 2 == 0) {
			System.out.println("Het getal is even.");
		} else {
			System.out.println("Het getal is oneven.");
		}
	}


	// Opdracht 2: Grader

	// Methode voor Grader
	public static void performECTSGrading(Scanner scanner) {
		short grade;
		do {
			System.out.print("Voer een cijfer in (1-10): ");
			grade = (short) getNumberInput(scanner, true);
			if (grade < 1 || grade > 10) {
				System.out.print("Ongeldige invoer. Probeer opnieuw: ");
			}
		} while (grade < 1 || grade > 10);
		System.out.println("Je score is: " + determineAssessment(grade));
	}

	public static String determineAssessment(short grade) {
		if (grade < 6) return "F";
		else if (grade < 6.5) return "E";
		else if (grade < 7.5) return "D";
		else if (grade < 8) return "C";
		else if (grade <= 8.5) return "B";
		else return "A";
	}


	// Opdracht 3: Grootste van Twee Getallen

	public static void checkBiggestNumber(Scanner scanner) {
		System.out.print("Voer het eerste getal in: ");
		int a = getNumberInput(scanner, false);
		System.out.print("Voer het tweede getal in: ");
		int b = getNumberInput(scanner, false);
		System.out.println("Het grootste getal is: " + findBiggestNumber(a, b));
	}

	public static int findBiggestNumber(int x, int y) {
		return Math.max(x, y);
	}


	//Opdracht 4: Positief/Negatief/Zero Checker.

	//Invoer voor check of getal positief, nul of negatief is
	public static void checkPosNeg(Scanner scanner) {
		System.out.print("Voer een getal in: ");
		int number = getNumberInput(scanner, false);
		System.out.println("Het getal is " + checkPosNegResult(number));
	}

	public static String checkPosNegResult(int number) {
		if (number == 0) return "nul";
		else if (number > 0) return "positief";
		else return "negatief";
	}


	// Opdracht 5: Leeftijdsclassificatie

	public static void checkAge(Scanner scanner) {
		System.out.print("Voer je leeftijd in: ");
		short number = (short) getNumberInput(scanner, true);
		String leeftijdsClassificatie = (number < 18) ? "jeugd" : (number > 64 ? "oudje" : "volwassene");
		System.out.println("Jij bent een  " + leeftijdsClassificatie);
	}


	// Opdracht 6: Tekstlengte Checker


	public static void checkTextLength(Scanner scanner) {
		System.out.print("Voer een tekst in om te checken of de tekst kort, middellang of lang is: ");
		String input = getStringInput(scanner);
		int length = input.length();
		String lengteClassificatie = (length < 10) ? "kort" : (length > 20 ? "lang" : "middellang");
		System.out.println("De tekst is " + lengteClassificatie + ".");
	}


	// Opdracht 7: Jaar Checker

	public static void checkLeapYear(Scanner scanner) {
		System.out.print("Voer een jaartal in om te checken of het een schrikkeljaar is: ");
		int number = scanner.nextInt();
		if ((number % 4 == 0) && number % 100 != 0 || (number % 400 == 0)) {
			System.out.println("Het is een schrikkeljaar");
		}
	}


	// Opdracht 8: Grootste van Drie Getallen

	public static void checkBiggestNumberOfThree(Scanner scanner) {
		System.out.print("Voer het eerste getal in: ");
		int a = getNumberInput(scanner, false);
		System.out.print("Voer het tweede getal in: ");
		int b = getNumberInput(scanner, false);
		System.out.print("Voer het derde getal in: ");
		int c = getNumberInput(scanner, false);
		System.out.println("Het grootste getal is: " + findBiggestNumberOfThree(a, b, c));
	}

	public static int findBiggestNumberOfThree(int x, int y, int z) {
		return Math.max(x, Math.max(y, z));
	}


	// Opdracht 9: Driehoekstype

	public static void checkTriangleType(Scanner scanner) {
		System.out.print("Voer de lengte van zijde A in cm in: ");
		int a = getNumberInput(scanner, false);
		System.out.print("Voer de lengte van zijde B in cm in: ");
		int b = getNumberInput(scanner, false);
		System.out.print("Voer de lengte van zijde C in cm in: ");
		int c = getNumberInput(scanner, false);
		System.out.println("De driehoek is een: " + findTriangleType(a, b, c));

	}

	public static String findTriangleType(int x, int y, int z) {
		if (x + y <= z || x + z <= y || y + z <= x) {
			return "Dit kan geen driehoek zijn"; // Niet mogelijk
		} else {
			if (x == y && y == z) {
				return "gelijkzijdige driehoek";
			} else if (x == y || y == z || x == z) {
				return "Gelijkbenige driehoek";
			} else {
				return "Ongelijkzijdige driehoek";
			}
		}
	}

	// Opdracht 10: Calculator

	public static void makeCalculation(Scanner scanner) {
		System.out.print("Voer een berekening in in de vorm \"getal operator getal\" en druk op enter (bijvoorbeeld: 5 + 3): ");

		scanner.nextLine();

		String input = scanner.nextLine();

		String[] parts = input.trim().split("\\s+");
		if (parts.length != 3) {
			System.out.println("Ongeldige invoer. Gebruik formaat: getal operator getal");
			return;
		}


		try {
			int a = Integer.parseInt(parts[0]);
			String operator = parts[1];
			int b = Integer.parseInt(parts[2]);

			System.out.println("Het resultaat van " + a + " " + operator + " " + b + " = " + calculate(a, operator, b));
		} catch (NumberFormatException e) {
			System.out.println("Ongeldige getallen ingevoerd");
		}
	}

	public static double calculate(int a, String operator, int b) {
		switch (operator) {
			case "+":
				return a + b;
			case "-":
				return a - b;
			case "*":
				return a * b;
			case "/":
				if (b == 0) {
					System.out.println("Deling door nul is niet mogelijk");
					return 0;
				}
				return (double) a / b;
			default:
				System.out.println("Ongeldige operator");
				return 0;
		}
	}

	// Helper method for safe check van integer of short input
	Benodigd in functies:
	int number = getNumberInput(scanner, false); // for int input
	short number = (short) getNumberInput(scanner, true); // for short input



	private static int getNumberInput(Scanner scanner, boolean asShort) {
		while (asShort ? !scanner.hasNextShort() : !scanner.hasNextInt()) {
			System.out.print("Ongeldige invoer. Probeer opnieuw: ");
			scanner.next();
		}
		return asShort ? scanner.nextShort() : scanner.nextInt();
	}

	// Helper method for safe string input
	private static String getStringInput(Scanner scanner) {
		String input = scanner.nextLine();
		while (input.trim().isEmpty()) {
			System.out.print("Ongeldige invoer. Probeer opnieuw: ");
			input = scanner.nextLine();
		}
		return input;
	}
}


