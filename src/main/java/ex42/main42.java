/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex42;

import java.io.*;

public class main42 {

    static String[] Read_File() throws IOException {
        // Create an input file
        BufferedReader input = new BufferedReader(new FileReader("exercise42_input.txt"));

        // Create list to store values
        int line_num = Lines_in_Input();
        String[] data = new String[line_num];

        for (int i = 0; i < line_num; i++)
            data[i] = input.readLine();

        return data;
    }

    static int Lines_in_Input() throws IOException {
        // Check number of lines in file
        int line_num = 0;
        LineNumberReader line_r = new LineNumberReader(new FileReader("exercise41_input.txt"));
        while (line_r.readLine() != null)
            line_num = line_r.getLineNumber();

        return line_num;
    }

    public static void main(String[] args) throws IOException {
        Output.Print();
    }
}
