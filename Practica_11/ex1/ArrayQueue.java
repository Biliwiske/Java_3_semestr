package Practica_11.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueue {
    Queue<Object> queue = new LinkedList<>();
    public void enqueue(Object element){
        queue.add(element);
    }
    public void element(){System.out.println(queue.peek());}
    public void dequeue(){
        queue.remove();
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        return queue.peek() == null;
    }
    public void clear(){
        while (queue.peek()!= null) {
            queue.remove();
        }
    }
}
