package Practica_7;

import java.util.Stack;

public class My_Game {
    Stack<Integer> first_person = new Stack<>();
    Stack<Integer> second_person = new Stack<>();
    public void start_game(String first, String second) {
        for(int i = 4; i > -1; i --)
        {
            first_person.push(Integer.parseInt(first.substring(i,i+1)));
            second_person.push(Integer.parseInt(second.substring(i,i+1)));
        }
    }
    public void round_start() {
        int count = 0;
        while (!first_person.isEmpty() && !second_person.isEmpty() && count <= 105) {
            if (first_person.peek() > second_person.peek() && second_person.peek() != 0)
            {
                pop_it(first_person,first_person.pop());
                pop_it(first_person,second_person.pop());
            }
            else
            {
                pop_it(second_person,first_person.pop());
                pop_it(second_person,second_person.pop());
            }
            count++;
        }
        if (count == 106){
            System.out.println("botva");
        }
        if (first_person.empty()) {
            System.out.println("second " + count);
        }
        if (second_person.empty()) {
            System.out.println("first " + count);
        }
    }
    public void pop_it(Stack<Integer> stack, Integer number)
    {
        Stack<Integer> ns = new Stack<>();
        while (!stack.isEmpty())
            ns.push(stack.pop());
        stack.push(number);
        while (!ns.isEmpty())
            stack.push(ns.pop());
    }

    public static void main(String[] args) {
        My_Game first_game = new My_Game();
        My_Game second_game = new My_Game();
        first_game.start_game("13579", "24680");
        first_game.round_start();
        second_game.start_game("12345", "67890");
        second_game.round_start();
    }
}
