package Practica_2;

public class Author {
    private final String name;
    private String email;
    private final char gender;
    public Author(String a, String b, char c)
    {
        name = a;
        email = b;
        gender = c;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return name + " (" + gender + ") at " + email;
    }
}
