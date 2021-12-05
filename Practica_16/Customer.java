package Practica_16;

public final class Customer {
    String first_name, second_name;
    int age;
    Address address;
    Customer MATURE_UNKNOWN_CUSTOMER, NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirst_name() {
        return first_name;
    }
    public String getSecond_name() {
        return second_name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
}
