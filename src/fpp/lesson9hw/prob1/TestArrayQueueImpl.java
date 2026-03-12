package fpp.lesson9hw.prob1;

public class TestArrayQueueImpl {
    void main(){
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        System.out.println("inital: " + arrayQueue);
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("peak when null: " + arrayQueue.peek());
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(11);


        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());
        System.out.println("deque: " + arrayQueue.dequeue());

        arrayQueue.enqueue(12);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        arrayQueue.enqueue(15);

        System.out.println("final: " + arrayQueue);

        System.out.println("peak: " + arrayQueue.peek());
    }
}
