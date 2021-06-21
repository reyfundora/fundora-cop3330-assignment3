/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex46;

import java.io.*;
import java.util.*;

public class main46 {


    static void Print() throws IOException {
        String[][] output = Sorting.Big_to_Small();
        int rows_num = output.length;

        // Print out word chart
        for (int i = 0; i < rows_num; i++) {
            System.out.printf("%-11s %-11s\n", output[i][0], output[i][1]);
        }
    }

    public static void main(String[] args) throws IOException {
        Print();
    }
}