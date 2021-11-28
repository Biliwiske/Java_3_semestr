package Laba_12.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4 {
    public static void main(String[] args){
        List<String> emails = new ArrayList<>();
        emails.add("user@example.com");
        emails.add("root@localhost");
        //Неправильный адрес:
        emails.add("myhost@@@com.ru");
        emails.add("@my.ru");
        emails.add("Julia String");

        String regex = "^[A-Za-z0-9+_.-]+@[a-z.]+";
        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
