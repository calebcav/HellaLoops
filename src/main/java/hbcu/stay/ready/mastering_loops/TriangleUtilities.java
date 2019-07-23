package hbcu.stay.ready.mastering_loops;


public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String triangle = "";

        for (int i = 1; i <= numberOfRows; i++) {
            triangle += getTriangleHelper(i) + "\n";


        }

        return triangle;
    }

    private static String getTriangleHelper(int row){
        String triangle = "";

        for (int j = 0; j < row; j++) {
            triangle += "*";


        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {

        String row = "";

        for (int i = 1; i <= numberOfStars; i ++){
            row += "*";
        }


        return row;
    }

    public static String getSmallTriangle() {

        String triangle = "";

        for (int i = 1; i <= 4; i++) {
            triangle += getSmallTriangleHelper(i) + "\n";


        }

        return triangle;
    }

    private static String getSmallTriangleHelper(int row){
        String triangle = "";

        for (int j = 0; j < row; j ++ ){
            triangle += "*";

        }

        return triangle;

    }

    public static String getLargeTriangle() {

        String triangle = "";

        for (int i = 1; i <= 9; i++) {
            triangle += getLargeTriangleHelper(i) + "\n";

        }

        return triangle;
    }


    private static String getLargeTriangleHelper(int row){
        String triangle = "";

        for (int j = 0; j < row; j++) {
             triangle += "*";

        }

        return triangle;
    }


}
