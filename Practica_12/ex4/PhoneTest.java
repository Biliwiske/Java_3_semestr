package Practica_12.ex4;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("+79853421149");
        Phone p2 = new Phone("89853421149");
        Phone p3 = new Phone("+109853421149");
        p1.PhoneOut();
        p2.PhoneOut();
        p3.PhoneOut();
    }
}
