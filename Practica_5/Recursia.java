package Practica_5;
import java.util.Scanner;

public class Recursia {
    public static int recursion_1(int n, int count) {
        System.out.print(count + " ");
        if (count == n) {
            return 1;
        }
        count = count + 1;
        return recursion_1(n, count);
    }
    public static int recursion_2(int n, int count) {
        count = count + (n%10);
        n = n/10;
        if (n < 10) {
            count = count + n;
            System.out.print(count);
            return 1;
        }
        return recursion_2(n, count);
    }
    public static void recursion_3(int a, int b) {
        if(a == b) {
            System.out.print(b);
            return;
        }
        if(a < b) {
            System.out.print(a + " ");
            a = a + 1;
            recursion_3(a, b);
        }
        if(a > b) {
            System.out.print(b + " ");
            b = b - 1;
            recursion_3(a, b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Введите длину: ");
        int n = sc.nextInt();
        System.out.print("Числа от 1 до n: ");
        recursion_1(n, count);
        count = 0;
        System.out.println();
        System.out.print("Сумма цифр в числе n: ");
        recursion_2(n, count);
        System.out.println();
        System.out.print("Введите число A: ");
        int a = sc.nextInt();
        System.out.print("Введите число B: ");
        int b = sc.nextInt();
        recursion_3(a, b);
    }
}
