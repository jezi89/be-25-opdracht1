public class Main {


    public static void main(String[] args) {

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);

    }

    public static void hello() {
        System.out.println(" Hello World");
    }

    // De positiveOrNegative-methode controleert of het getal positief of negatief is
    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    // De positiveOrZeroOrNegative-methode controleert of het getal positief, nul, of negatief is
    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    // De bartender-methode geeft op basis van de naam aan welk drankje deze persoon drinkt
    public static void bartender(String name) {
        switch (name) {
            case "Henk":
                System.out.println("Bacardi and Coke");
                break;
            case "Anna":
                System.out.println("Mojito");
                break;
            case "John":
                System.out.println("Margarita");
                break;
            case "Lisa":
                System.out.println("Other");
                break;
            default:
                System.out.println("No valid choice");
                break;
        }
    }

    // De sum-methode berekent en print de som van input1 en input2
    public static void sum(int input1, int input2) {
        System.out.println(input1 + " summed by " + input2 + " is " + (input1 + input2));
    }
}

