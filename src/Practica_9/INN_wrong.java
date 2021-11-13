package Practica_9;

public class INN_wrong extends Throwable {
    public INN_wrong(String data){
        super("ИНН "+ data + " неверный!");
    }
}