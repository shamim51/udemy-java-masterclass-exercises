package solutions.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Maqqa");
        placesToVisit.add("Madina");
        placesToVisit.add(0, "Jeruzalem");

        System.out.println(placesToVisit);
    }
}
