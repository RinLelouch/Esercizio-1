package Ex19;

public class Student {
    public String name ;
    public int age;
    public Student(String name, int age){
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }
    public Student (String name){
        this.name = name;
        System.out.println("2322");
    }
    public Student (int age){
        this.age=age;
        System.out.println("22");
    }
    public Student (){
        System.out.println("log!");
    }
}
