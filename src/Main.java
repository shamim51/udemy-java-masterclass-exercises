import solutions.DiagonalStar;
import solutions.NumberToWords;

public class Main {
    public static void main(String[] args) {
//       System.out.println( NumberToWords.getDigitCount(123));
//       System.out.println( NumberToWords.getDigitCount(321));
//       System.out.println(001);

      // NumberToWords.numberToWords(0);
        //DiagonalStar.printSquareStar(8);

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Strating index is "+ startingIndex);
        System.out.println("Birth year = "+ birthDate.substring(startingIndex));

        System.out.println(birthDate.replace("/", "-"));

        String newDate = birthDate.replace("/", "-");
        System.out.println(newDate);
        System.out.println(birthDate);
    }
}