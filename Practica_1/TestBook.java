package Practica_1;

public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("War and Peace", "Tostoi", 1867);
        Book b2 = new Book("The Last Poet", "Esenin", 1920);
        Book b3 = new Book("Shrek", "Ded moroz", 2002);
        b3.SetName("Night");
        b1.SetYear(1803);
        b2.SetAuthor("Pushkin");
        b3.SetYear(2020);
        b1.GetInfo();
        b2.GetInfo();
        b3.GetInfo();
    }
}
