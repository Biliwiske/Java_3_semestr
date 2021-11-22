package Practica_12.ex1;

public class Person {
    String name, second_name, middle_name;

    public Person(String second_name, String name, String middle_name) {
        this.second_name = second_name;
        this.name = name;
        this.middle_name = middle_name;
    }
    public Person(String name) {
        this.name = name;
    }
    public void Person_Out() {
        if(this.second_name == null && this.middle_name == null)
            System.out.println("Имя: " + this.name);
        else
            System.out.println("ФИО: " + this.second_name + " " + this.name + " " + this.middle_name);
    }
}
