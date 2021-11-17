package Practica_1;

public class Book {
    private String name;
    private String author;
    private int year;
    public Book(String a, String b, int c)
    {
        name = a;
        author = b;
        year = c;
    }
    public Book(String a, String b)
    {
        name = a;
        author = b;
        year = 0;
    }
    public Book(String a)
    {
        name = a;
        author = "None";
        year = 0;
    }
    public Book()
    {
        name = "None";
        author = "None";
        year = 0;
    }
    public void SetAuthor(String a)
    {
        this.author = a;
    }
    public void SetName(String a)
    {
        this.name = a;
    }
    public void SetYear(int a)
    {
        this.year = a;
    }
    public void GetInfo()
    {
        System.out.println("Name of book '"+ name + "' year of release " + year + ", author '" + author + "'");
    }
}
