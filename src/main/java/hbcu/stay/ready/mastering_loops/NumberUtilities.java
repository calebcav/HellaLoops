package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String evenNumbers = "";

        for (int i = start; i < stop; i++){

            evenNumbers = checkEven(i, evenNumbers);
        }

        return evenNumbers;
    }


    private static String checkEven(int num, String evenNumbers){

        if(num != 0){
            if (num % 2 == 0){
                evenNumbers += num;
            }
        }

        return evenNumbers;

    }



    public static String getOddNumbers(int start, int stop) {

        String oddNumbers = "";

        for (int i = start; i < stop; i++){
            oddNumbers = checkOdd(i, oddNumbers);
        }


        return oddNumbers;
    }

    private static String checkOdd(int num, String oddNumbers){

        if (num != 0){
            if (num % 2 != 0){
                oddNumbers += num;
            }
        }

        return oddNumbers;

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String squaredNumbers = "";

        for (int i = start; i < stop; i += step){
            squaredNumbers += i * i;
        }

        return squaredNumbers;
    }

    public static String getRange(int stop) {

        String range = "";

        for (int i = 0; i < stop; i++){
            range += i;
        }


        return range;
    }

    public static String getRange(int start, int stop) {

        String range = "";

        for (int i = start; i < stop; i++){
            range += i;
        }

        return range;
    }


    public static String getRange(int start, int stop, int step) {


        String range = "";

        for (int i = start; i < stop; i += step){
            range += i;
        }

        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String exponentiations = "";

        for (int i = start; i < stop; i += step){
            exponentiations += (int) (Math.pow(i, exponent));
        }




        return exponentiations;
    }
}
