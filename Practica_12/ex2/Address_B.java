package Practica_12.ex2;

import java.util.StringTokenizer;

public class Address_B {
    String country, region, city, street, house, building, flat;
    public Address_B(String line){
        StringTokenizer words = new StringTokenizer(line, ",.;");

        this.country = words.nextToken();
        this.region = words.nextToken();
        this.city = words.nextToken();
        this.street = words.nextToken();
        this.house = words.nextToken();
        this.building = words.nextToken();
        this.flat = words.nextToken();
    }
    public void AddressB_Out(){
        System.out.println("Страна: " + this.country + ", Регион: " + this.region + ", Город: " + this.city +
                ", Улица: " + this.street + ", Дом: " + this.house + ", Корпус: " + this.building + ", Квартира: "
                + this.flat);
    }
}
