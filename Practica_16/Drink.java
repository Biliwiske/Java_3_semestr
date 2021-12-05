package Practica_16;

public final class Drink implements Alcoholable{
    double alcoholVol;
    DrinkTypeEnum type;
    Drink(DrinkTypeEnum type, double alcoholVol) {
        this.type = type;
        this.alcoholVol = alcoholVol;
    }
    DrinkTypeEnum GetType() {
        return this.type;
    }

    @Override
    public void isAlcoholicDrink() {

    }

    @Override
    public void GetAlcoholVol() {

    }
}
