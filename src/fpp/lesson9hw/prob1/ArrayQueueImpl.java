package fpp.lesson9hw.prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 3;
    // renamed to clear confusion.
    private int sizeCapacity;
    private Integer[] arr;
    private int front;
    private int rear;

    ArrayQueueImpl() {
        front = 0;
        rear = 0;
        sizeCapacity = DEFAULT_CAPACITY;
        arr = new Integer[sizeCapacity];
    }

    // Add Constructors, Default and Parameterized to initialize instance fields
    public Integer peek() {
        if (isEmpty()) return  null;
        return arr[(rear-1) % sizeCapacity];
        //implement
    }

    public void enqueue(int obj) {
        if (size() >= sizeCapacity) {
            resize();
        }
        arr[rear % sizeCapacity] = obj;
        rear++;
    }

    public Integer dequeue() {
        if (isEmpty()) return  null;
        int tmp = arr[front % sizeCapacity];
        front++;
        return  tmp;
    }

    public boolean isEmpty() {
        //implement
        return size() == 0;
    }

    public int size() {
        //implement
        return rear-front;
    }

    private void resize() {
        Integer[] newArr = new Integer[sizeCapacity * 2];
        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[(i+front) % sizeCapacity];
        }
        sizeCapacity = sizeCapacity * 2;
        arr = newArr;
        rear = size();
        front = 0;
    }

    public String toString() {
 /* Return data in this format, each element separated by comma with in [ ] eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (size() == 0) return null;

        StringBuilder ob = new StringBuilder("[");
        for (int i = front; i < rear-1; i ++) {
            ob.append(arr[i % sizeCapacity]);
            ob.append(", ");
        }

        ob.append(arr[(rear-1 )% sizeCapacity]);
        ob.append(" ]");
        return ob.toString();
    }
}
