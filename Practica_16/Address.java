package Practica_16;

public final class Address {
    String cityName, streetName;
    int ZipCode, apartmentNumber, buildingNumber;
    char buildingLetter;
    Address EMPTY_ADDRESS;
    public int getZipCode() {
        return ZipCode;
    }
    public String getCityName() {
        return cityName;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public char getBuildingLetter() {
        return buildingLetter;
    }
    public int getBuildingNumber() {
        return buildingNumber;
    }
}
