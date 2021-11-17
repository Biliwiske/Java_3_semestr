package Practica_10.ex2;

public class Client
{
    Chair chair;
    void sit() {
        System.out.println("Вы сели на стул, похоже он вам нравится");
    }
    void SetChair(Chair chair)
    {
        this.chair = chair;
    }
}
