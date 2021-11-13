package Practica_9;

public class FIO_wrong extends Throwable {
    public FIO_wrong(String data){
        super("ФИО "+ data + " не найдена!");
    }
}
