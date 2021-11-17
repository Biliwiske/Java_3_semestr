package Laba_10.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] Array = new String[10];
        ArrayList<Object> ArrayList = new ArrayList<>();
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
        System.out.println(Arrays.toString(Array));
        ArrayList.addAll(Arrays.asList(Array).subList(0, 10));
        System.out.println(ArrayList);
    }
}
