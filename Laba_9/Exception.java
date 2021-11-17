package Laba_9;

import java.util.Scanner;

public class Exception extends Throwable {
    public Exception(String key_set_to_empty_string) {
    }

    public static void main(String[] args) {
        String key = null;
        //exception1();
        //exception2();
        //exception3();
        //exception4();
        //exception5(key);
        //exception6();
        exception7();
        exception8();
    }

    public static void exception1() {
        System.out.println( 2 / 0 );
    }

    public static void exception2() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public static void exception3() {
        try {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch (NumberFormatException e)
        {
            System.out.println("Вводить можно только цифры и числа");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Нельзя делить на 0");
        }
    }

    public static void exception4() {
        try {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch (NumberFormatException e)
        {
            System.out.println("Вводить можно только цифры и числа");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Нельзя делить на 0");
        }
        finally {
            System.out.println("Работа завершена");
        }
        }

    public static void exception5(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        // do something with the key
    }

    public static void exception6() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        //printDetails(key);
    }

    public static void exception7() {

    }

    public static void exception8() {
        getKey();
    }

    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        while(true) {
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try
            {
                printDetails(key);
                break;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }


    /*
    public static void printDetails(String key) {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key == "")
        {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
     */
}

