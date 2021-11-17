package Practica_1;
public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Latex", 2,15);
        Ball b2 = new Ball("Latex", 3,16);
        Ball b3 = new Ball("Rubber");
        b3.SetWeight(4);
        b1.SetDiameter(14);
        b2.SetMaterial("Cotton");
        b3.SetDiameter(15);
        b1.GetInfo();
        b2.GetInfo();
        b3.GetInfo();
    }
}
