public class ifelse {

    // Methode voor Even/Odd check
    public class Ifelse_Test {
        public static void main(String[] args) {

        }


        public static void checkEvenOdd(int getal) {
            if (getal % 2 != 0) {
                System.out.println("Dit is een oneven getal");
            } else {
                System.out.println("Dit is een even getal");
            }
        }

        // Methode om beoordeling te bepalen
        public static String bepaalBeoordeling(double cijfer) {
            if (cijfer > 0 && cijfer < 4.5) {
                return "F";
            } else if (cijfer >= 4.5 && cijfer < 5.5) {
                return "D";
            } else if (cijfer >= 5.5 && cijfer < 7.0) {
                return "C";
            } else if (cijfer >= 7.0 && cijfer < 8.5) {
                return "B";
            } else if (cijfer >= 8.5 && cijfer <= 10) {
                return "A";
            } else {
                return "Invalid score";
            }
        }
    }
}

