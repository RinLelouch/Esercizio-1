package AdvancedEx6;

public class Exercises {

    public static void main(String[] args) throws InterruptedException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        private boolean isWeekEnd;
        Days(boolean isWeekEnd){
            this.isWeekEnd=isWeekEnd;
        }
    }



    private enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER;


    }
    public enum TrafficLight{
        GREEN,
        YELLOW,
        RED;
    }
    public enum Operator{
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
        double result;

        void ADD(double num1, double num2) {
           result=num1+num2;
            System.out.println(result);
        }
        void MULTIPLY(double num1, double num2) {
            result=num1*num2;
            System.out.println(result);
        }
        void DIVIDE(double num1, double num2) {
            result=num1/num2;
            System.out.println(result);
        }
        void SUBTRACT(double num1, double num2) {
            result=num1%num2;
            System.out.println(result);
        }
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days i : Days.values()){
            System.out.println(i);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons currentSeason= Seasons.FALL;
        switch (currentSeason){
            case SPRING -> System.out.println("1 - 3");
            case SUMMER -> System.out.println("4 - 6");
            case FALL -> System.out.println("7 - 9");
            case WINTER -> System.out.println("10 - 12");
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3()  throws InterruptedException {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight state = TrafficLight.GREEN;
        for (int i = 0; i < TrafficLight.values().length; i++)
        {
            switch (state) {
                case RED -> {
                    System.out.println("RED");
                    state = TrafficLight.GREEN;
                }
                case GREEN -> {
                    System.out.println("GREEN");
                    state = TrafficLight.YELLOW;
                }
                case YELLOW -> {
                    System.out.println("YELLOW");
                    state = TrafficLight.RED;
                }
            }
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days[] days = Days.values();
        for (Days day : days){
            System.out.println(day);
            System.out.println(day.isWeekEnd);
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here



        double num1 = 5;
        double num2 = 2;
        Operator.ADD.ADD(num1,num2);
    }

}
