package AdvancedEx10;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address){
        this.name=name;
        this.address=address;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return "name: " + name + "\n" + "age: " + age + "\n" +"address: " + address;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}
