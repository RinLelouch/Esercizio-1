package Ex3;

public class Main {
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        int age = 25;
        System.out.println("my age is = " + age);
        // Write your code here
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        char nameInitial = 'A';
        int age = 25;

        System.out.println("My age is " + age + " and "+  "my initial name is "+ nameInitial);
        //Write your code here
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //stiamo nominando una variabile di tipo booleano alla quale stiamo assegnando un valore false
        boolean hasEatenLunch = false;
        //stiamo nominando una variabile di tipo double alla quale stiamo assegnango un valore 5.99
        double lunchCost = 5.99;
        //stiamo stampando in console la variabile di tipo double dichiarata in precedenza preceduta da una stringa
        System.out.println("Lunch cost=" + lunchCost);
        //stiamo stampando in console la variabile di tipo booleano dichiarata in precedenza preceduta da una stringa
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
