package hbcu.stay.ready.mastering_loops;

import java.util.*;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String expected = "";

        for (int i = 1; i <= 4; i++) {
             expected += getSmallMultiplicationTableRoW(i) + "\n";
        }

        return expected;
    }


    private static String getSmallMultiplicationTableRoW(int row){
        String expected = "";

        for (int j = 1; j <= 4; j++) {
             expected += String.format("%3s |", row * j);
        }
        return expected;
    }

    public static String getLargeMultiplicationTable() {

        String expected = "";


        for (int i = 1; i <= 10; i++) {
            expected += getLargeMultiplicationTableRow(i) + "\n";
        }


        return expected;
    }

    private static String getLargeMultiplicationTableRow ( int row) {

        String expected = "";

        for (int j = 1; j <= 10; j++){
            expected += String.format("%3s |", row * j);


        }
        return expected;
    }


    public static String getMultiplicationTable ( int tableSize){

            String table = "";


            for (int x = 1; x <= tableSize; x++) {
                table += getMultiplicationTableRow(x, tableSize) + "\n";
            }


            return table;
    }

    private static String getMultiplicationTableRow ( int row, int tableSize){
            String table = "";

            for (int y = 1; y <= tableSize; y++) {
                table += String.format("%3s |", y * row);
            }

            return table;
    }

}
