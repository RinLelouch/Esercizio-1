package Ex20;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student = new Student();
        String name= "Andrea";
        String surname="Occhiello";
        int age= 25;
        int peso= 96;
        String nationality= "Italian";
        student.setName(name);
        System.out.println(student.getName());
        student.setNationality(nationality);
        System.out.println(student.getNationality());
        student.setAge(age);
        System.out.println(student.getAge());
        student.setPeso(peso);
        System.out.println(student.getPeso());
        student.setSurname(surname);
        System.out.println(student.getSurname());



        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student = new Student();
        String name= "Andrea";
        String surname="Occhiello";
        int age= 25;
        int peso= 96;
        String nationality= "Italian";
        student.setPeso(peso);
        System.out.println(student.getPeso());
        student.setAge(age);
        System.out.println(student.getAge());
        student.setSurname(surname);
        System.out.println(student.getSurname());
        //Write your code here
    }

}
