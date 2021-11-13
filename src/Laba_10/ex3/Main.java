package Laba_10.ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    private static final Object[] Array = new Object[10];

    public static void main(String[] args) {
        Array();
        System.out.println(ReturnByIndex(3));
    }
    
    public static void Array()
    {
        Array[0] = "a";
        Array[1] = "b";
        Array[2] = "c";
        Array[3] = "d";
        Array[4] = "e";
        Array[5] = "f";
        Array[6] = "g";
        Array[7] = "h";
        Array[8] = "k";
        Array[9] = "l";
    }
    public static Object ReturnByIndex(int index)
    {
        return Array[index];
    }
}
