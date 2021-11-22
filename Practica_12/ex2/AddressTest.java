package Practica_12.ex2;

public class AddressTest {
    public static void main(String[] args){
        Address_A a1 = new Address_A("Страна,Регион,Город,Улица,Дом,Корпус,Квартира");
        a1.AddressA_Out();
        Address_B b1 = new Address_B("Страна,Регион;Город.Улица;Дом,Корпус.Квартира");
        b1.AddressB_Out();
    }
}
