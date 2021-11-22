package Practica_12.ex2;

public class Address_A {
    String country, region, city, street, house, building, flat;
    public Address_A(String line){
        String[] words = line.split(",");
        this.country = words[0];
        this.region = words[1];
        this.city = words[2];
        this.street = words[3];
        this.house = words[4];
        this.building = words[5];
        this.flat = words[6];
    }
    public void AddressA_Out(){
        System.out.println("Страна: " + this.country + ", Регион: " + this.region + ", Город: " + this.city +
                ", Улица: " + this.street + ", Дом: " + this.house + ", Корпус: " + this.building + ", Квартира: "
                + this.flat);
    }
}
