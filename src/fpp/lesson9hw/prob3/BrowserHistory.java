package fpp.lesson9hw.prob3;

import java.util.Stack;

public class BrowserHistory {
    // made them final based on idea suggestion.
    private final Stack<String> history;
    private final Stack<String> future;
    private String cur;
    public  BrowserHistory(String url){
        history = new Stack<>();
        future = new Stack<>();
        cur = url;
    }

    public void visit(String url){
        history.push(cur);
        cur = url;
        System.out.println("Visited: " + cur);
    }

    public void back(){
        if (history.isEmpty() ){
            System.out.println("No history to go back to.");
        } else{
            future.push(cur);
            cur = history.pop(); // pop
            System.out.println("Back to: " + cur);
        }

    }

    public void forward(){
        if (future.isEmpty()){
            System.out.println("No Forward History.");
        } else{
            history.push(cur);
            cur = future.pop();
            System.out.println("Forward to: " + cur);
        }
    }
}
