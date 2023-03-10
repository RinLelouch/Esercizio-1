package Ex2;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        char nameInitial = 'A';
        char surnameInitial = 'O';
        String fullNameInitial = String.valueOf(nameInitial) + ' ' + String.valueOf(surnameInitial);
        System.out.println(nameInitial);
        System.out.println(surnameInitial);
        System.out.println("My full name initial are = " + fullNameInitial);
        HO USATO IL VALUEOF, PER 'VEDERNE' UNA APPLICAZIONE, E' CORRETTA?
       
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        int age = 25;
        System.out.println(age);
        boolean hadLunchToday = true;
        System.out.println(hadLunchToday);
        double lunchCostEuro = 4.99;
        System.out.println(lunchCostEuro);

        // Write your code here
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        int age = 25;
        System.out.println(age);
        boolean hadLunchToday = true;
        System.out.println(hadLunchToday);
        double lunchCostEuro = 4.99;
        System.out.println(lunchCostEuro);
        // Write your code here
    }
}
