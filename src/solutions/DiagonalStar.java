package solutions;

public class DiagonalStar {
    // write code here
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            /*
            if (i == 1 || i == number) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
            }*/
             for(int j = 1; j <= number; j++){
                 if((i == 1|| j == 1) || (i == number || j == number)){
                     System.out.print("*");
                 }else {
                     System.out.print(" ");
                 }



             }

            System.out.println();
        }
    }
}