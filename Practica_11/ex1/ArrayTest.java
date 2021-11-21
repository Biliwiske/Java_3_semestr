package Practica_11.ex1;

public class ArrayTest {
    public static void main(String[] args){

        ArrayQueue a1 = new ArrayQueue();
        System.out.println("Проверка на пустоту очереди до добавления элементов: " + a1.isEmpty());
        a1.enqueue("a");
        a1.enqueue(10);
        a1.enqueue(1.5);
        System.out.println("Размер очереди после добавления элементов: " + a1.size());
        a1.element();
        a1.dequeue();
        a1.element();
        System.out.println("Проверка на пустоту очереди: " + a1.isEmpty());
        a1.clear();
        a1.element();
        System.out.println("Размер очереди: " + a1.size());
    }
}
