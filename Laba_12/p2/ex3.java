package Laba_12.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex3 {
    public static void main(String[] args){
        List<String> date= new ArrayList<String>();
        date.add("29/02/2000");
        date.add("30/04/2003");
        date.add("01/01/2003");
        //Неправильная дата
        date.add("29/32/2001");
        date.add("30-04-2003");
        date.add("100/1/1899");

        String regex = "^([0][0-9]/|[1][0-9]/|[2][0-9]/|[3][0-1]/)([0][0-9]/|[1][0-2]/)([1-9][0-9][0-9][0-9])$";
        Pattern pattern = Pattern.compile(regex);

        for(String data : date){
            Matcher matcher = pattern.matcher(data);
            System.out.println(data +" : "+ matcher.matches());
        }
    }
}
