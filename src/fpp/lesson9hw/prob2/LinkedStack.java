package fpp.lesson9hw.prob2;

public class LinkedStack {
    static class Node{
        private Node next;
        private Node prv;
        private int val;
        Node(){}
        Node(int val){
            this.val = val;
        }

        Node(int val, Node prv, Node next){
            this.val = val;
            this.prv = prv;
            this.next = next;
        }
    }

    private  Node top;
    private int size;

    LinkedStack(){
        top = new Node();
        size = 0;
    }

    public void push(int val) {
        if (isEmpty()) top = new Node(val);
        else {
            Node nwNode = new Node(val, top, null);
            top.next = nwNode;
            top = nwNode;
        }
        size++;
    }

    public Integer pop(){
        if (isEmpty()) return null;
        int item = top.val;
        top = top.prv;
        top.next = null;
        size--;
        return item;
    }

    public boolean isEmpty(){
        return top.next == null;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "<empty>";
        Node first = top;
        while (first.prv != null) {
            first = first.prv;
        }
        StringBuilder sb = new StringBuilder();
        first = first.next;
        while(first != null) {
            sb.append(first.val).append(" ");
            first = first.next;
        }
        return sb.toString();
    }

    void main(){
        LinkedStack ls = new LinkedStack();
        ls.push(1);
        ls.push(2);
        System.out.println(ls);
        System.out.println("Size: " + ls.size());
        System.out.println(ls.isEmpty());
        ls.pop();
        System.out.println(ls);
        ls.pop();
        ls.pop();
        System.out.println("final: " + ls);
    }

}
