package Laba_12.p1;

import java.util.Objects;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        // проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "123abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());
    }
}
