package fpp.lesson4hw;

public class Prob1 {

    void  main(){

        System.out.println("Minimum character of zkal is : " + findMinimum("zkal"));
    }

    public String findMinimum(String s){
        return findMinimumLocal(s, 0);
    }

    public String findMinimumLocal(String s, int indx) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        if (s.length()-1 == indx){
            return s.substring(indx, indx+1);
        }

        String mn = findMinimumLocal(s, indx + 1);
        return s.substring(indx, indx+1).compareTo(mn) < 0 ? s.substring(indx, indx+1) : mn;
    }
}
