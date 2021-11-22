package Practica_12.ex4;

public class Phone {
    String code, first_part, second_part, third_part;
    public Phone(String number){
        StringBuilder num = new StringBuilder(number);
        this.code = num.substring(0, num.length() - 10);
        if (this.code.equals("8")) {
            this.code = "+7";
            this.first_part = num.substring(this.code.length()-1, this.code.length() + 2);
            this.second_part = num.substring(this.code.length() + 2, this.code.length() + 5);
            this.third_part = num.substring(this.code.length() + 5, this.code.length() + 9);
        }
        else
        {
            this.first_part = num.substring(this.code.length(), this.code.length() + 3);
            this.second_part = num.substring(this.code.length() + 3, this.code.length() + 6);
            this.third_part = num.substring(this.code.length() + 6, this.code.length() + 10);
        }

    }
    public void PhoneOut(){
        System.out.println(this.code + "(" + this.first_part + ")" + "-" + this.second_part + "-" + this.third_part);
    }
}
