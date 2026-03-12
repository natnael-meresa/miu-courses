package fpp.lesson9hw.prob4;

public class TestTicketingSystem {
    void main(){
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.addTicket("fist");
        ticketingSystem.addTicket("second");
        System.out.println(ticketingSystem.processTicket());
        ticketingSystem.viewNextTicket();
        ticketingSystem.addTicket("third");
        ticketingSystem.addTicket("final");
        ticketingSystem.viewNextTicket();
        System.out.println(ticketingSystem);
    }
}
