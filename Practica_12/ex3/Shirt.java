package Practica_12.ex3;

public class Shirt {
    String [] shirts = new String[11];
    public void Add_Shirt(String[] shirt){
        shirts[0] = shirt[0];
        shirts[1] = shirt[1];
        shirts[2] = shirt[2];
        shirts[3] = shirt[3];
    }
    public String toString(){
        return "Номер: " + shirts[0] + "; Название: " + shirts[1] + "; Цвет: " + shirts[2] + "; Размер: " + shirts[3];
    }
}
