package fpp.lesson12hw.prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        try{
            MyStack stack = new MyStack(3);

            // Basic operations (these will break when you add checks—students will add try/catch later)
            System.out.println("Push 10, 20, 30");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack);

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("After pop, peek: " + stack.peek());
            System.out.println("Stack: " + stack);

            // Uncomment later when exceptions are implemented
            stack.push(40);
//            stack.push(50);            // should cause overflow
//             stack.push(null);          // should cause null not allowed
             stack.pop(); stack.pop(); stack.pop(); stack.pop();  // empty now
            stack.pop();               // should cause underflow
//             stack.peek();              // should cause underflow
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
