package Practica_1;

public class Ball
{
    private String material;
    private int weight;
    private int diameter;
    public Ball(String a, int b, int c)
    {
        material = a;
        weight = b;
        diameter = c;
    }
    public Ball(String a, int b)
    {
        material = a;
        weight = b;
        diameter = 0;
    }
    public Ball(String a)
    {
        material = a;
        weight = 0;
        diameter = 0;
    }
    public Ball()
    {
        material = "None";
        weight = 0;
        diameter = 0;
    }
    public void SetWeight(int a)
    {
        this.weight = a;
    }
    public void SetMaterial(String a)
    {
        this.material = a;
    }
    public void SetDiameter(int a)
    {
        this.diameter = a;
    }
    public void GetInfo()
    {
        System.out.println("This ball made from "+material+" his weight = "+weight+" and it is are "+diameter+" in diameter");
    }
}
