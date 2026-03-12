package fpp.lesson9hw.prob4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {

    private Queue<Ticket> ticketQueue;
    private int nextId = 1;

    TicketingSystem(){
        ticketQueue = new LinkedList<>();
    }

    public void addTicket(String description) {
        ticketQueue.add(new Ticket(nextId, description));
        // this is not concurrency safe. use uuid or use mutex lock, or distributed locking mechanism.
        nextId++;
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) return  null;

        return ticketQueue.poll();
    }

    public  void viewNextTicket() {
        if (!ticketQueue.isEmpty()) System.out.println(ticketQueue.peek());
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("[");
        Iterator<Ticket> it = ticketQueue.iterator();
        while (it.hasNext()) {
            var ticket = it.next();
            sb.append(String.format("{id=%d, description=%s}, ", ticket.getId(), ticket.getDescription() ));
        }
        sb.append(" ]");

        return sb.toString();
    }
}
