package solutions;

public class NumberToWords {
    // write code here
    public static void numberToWords(int number) {
        if(number == 0) System.out.println("Zero");

        if(getDigitCount(number) == -1){
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number);

        int range = 0;
        if(getDigitCount(number) > getDigitCount(reversedNumber)){
            range = getDigitCount(number) - getDigitCount(reversedNumber);

            //System.out.println("range = "+ range);
        }

        while (reversedNumber != 0){
            int lastDigit = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;

            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }



        for(int i = 0; i < range; i++){
            System.out.println("Zero");
        }

    }


    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        if(number < 1) return -1;

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;

    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number = number / 10;
        }
        return reversedNumber;

    }

}