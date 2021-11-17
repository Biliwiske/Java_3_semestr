package Practica_9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class CheckerInn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // объявление переменной для ввода ФИО с клавиатуры
        while (true) {
            System.out.print("Введите ФИО: ");
            String data = sc.nextLine();
            try {
                FIO_check(data);
                break;
            } catch (FIO_wrong e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
    public static boolean FIO_check(String data) throws FIO_wrong {
        int count = 0; // переменная считающая количество пробелов в строке
        String inn = ""; // переменная содержащая Инн клиента
        String checker = ""; // переменная содержащая ФИО для проверки введенного ФИО клиентом
        Scanner sc = new Scanner(System.in); // объявление переменной для ввода Инн с клавиатуры
        try (FileReader reader = new FileReader("Inn_Fio.txt")) {
            int c; // переменная содержащая текущий символ
            while ((c = reader.read()) != -1) {
                if (c == ' ') {
                    count += 1;
                }
                if (count == 3) {
                    if (checker.equals(data)) {
                        reader.skip(2);
                        for (int i = 0; i < 7; i++) {
                            inn += (char) reader.read();
                        }
                        while (true) {
                            System.out.print("Введите ИНН: ");
                            String data1 = sc.nextLine();
                            try {
                                INN_check(data1, inn);
                                break;
                            } catch (INN_wrong e) {
                                System.out.println(e.getLocalizedMessage());
                            }
                        }
                        count = -1;
                        break;
                    }
                    count = 0;
                }
                else {
                    checker += (char) c;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (count != -1) throw new FIO_wrong(data);
        return true;
    }
    public static boolean INN_check(String data, String inn) throws INN_wrong {
        if(Objects.equals(data, inn))
        {
            System.out.println("Данные введены правильно, добро пожаловать");
        }
        else
        {
            throw new INN_wrong(data);
        }
        return true;
    }
}
