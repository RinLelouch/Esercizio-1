package Ex20;

public class Student {
    private String name ;
    private int age;
    private String surname;
    private String nationality;
    private int peso;


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
        if(age < 0){
            System.out.println("Age can't be negative");
        }else {
            this.age = age;
        }
    }

    public int getPeso() {
        peso = peso + age;
        return peso;
    }

    public void setPeso(int peso) {
        if(peso >= 95){
            System.out.println("ATTENZIONE, sovrappeso, rivolgersi ad un medico!");
        }
        this.peso = peso;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length() >= 10){
            System.out.println("rimanere tra 1 e 10 caratteri");
        }else{
        this.surname = surname;
    }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}