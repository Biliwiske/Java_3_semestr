package Laba_12.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        List emails = new ArrayList();
        emails.add("(1 + 8) – 9 / 4");
        //Неправильная фигня:
        emails.add("6 / 5 - 2 * 9");

        for(Object email : emails){
            System.out.println(email + ": " + Pattern.compile("\\d+\\s*\\+").matcher((CharSequence) email).find());
        }
    }
}
