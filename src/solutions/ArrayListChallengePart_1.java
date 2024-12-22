package solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallengePart_1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        printActions();
    }

    private static void printActions(){
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock + " ");
    }
}
