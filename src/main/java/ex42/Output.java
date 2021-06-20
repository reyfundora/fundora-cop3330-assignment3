/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex42;

import java.io.IOException;


public class Output {
    static String[][] Sorting() throws IOException {
        String[] data = main42.Read_File();
        int line_num = main42.Lines_in_Input();

        // Sorting previous data into their respective slot in a 2D array
        String[][] info = new String[line_num + 1][3];
        info[0][0] = "Last";
        info[0][1] = "First";
        info[0][2] = "Salary";

        for (int i = 1; i < line_num + 1; i++) {
            String input_sort = data[i - 1];
            String[] data_sort = input_sort.split(",");

            info[i][0] = data_sort[0];
            info[i][1] = data_sort[1];
            info[i][2] = data_sort[2];
        }

        return info;
    }

    static void Print() throws IOException {
        String[][] info = Sorting();

        // Print array using a for loop.
        System.out.println(info[0][0] + "\t\t" + info [0][1] + "\t\t" + info[0][2]);
        System.out.println("------------------------------");
        for(int i = 1; i < main42.Lines_in_Input() + 1; i++){
            System.out.printf("%-11s %-11s %-11s\n", info[i][0], info[i][1], info[i][2]);
        }
    }
}
