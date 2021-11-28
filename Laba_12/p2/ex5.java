package Laba_12.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ex5 {
    public static void main(String[] args) {
        List emails = new ArrayList();
        emails.add("_Googpass1");
        //Неправильная фигня:
        emails.add("pass123");

        for(Object email : emails){
            System.out.println(email + ": " + Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher((CharSequence) email).find());
        }
    }
}
