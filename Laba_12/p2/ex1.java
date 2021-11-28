package Laba_12.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args){
        List emails = new ArrayList();
        emails.add("25.98 USD");
        //Неправильная цена:
        emails.add("44 ERR");

        String regex = "[0-9.]+ (USD)?(EU)?(RUB)?";
        Pattern pattern = Pattern.compile(regex);

        for(Object email : emails){
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
