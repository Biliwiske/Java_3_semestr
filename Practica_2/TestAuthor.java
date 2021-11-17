package Practica_2;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1 = new Author("Ivan Popov","ivpop@somewhere.com", 'M');
        Author a2 = new Author("Anna Ivanova","annaivanova@somewhere.com", 'F');
        Author a3 = new Author("Seven","sevenauthor@somewhere.com", 'U');
        a1.setEmail("Ivan4ik@somewhere.com");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
