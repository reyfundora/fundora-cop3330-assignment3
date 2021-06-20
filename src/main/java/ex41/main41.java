/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex41;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main41 {
    static String[] Read_File() throws IOException {
        // Create an input file
        File input = new File("exercise41_input.txt");
        Scanner file_read = new Scanner(input);

        // Learn how many names are in the text file
        int line_num = Lines_in_Input();

        // Read the file and save to String array
        String[] data = new String[line_num];
        for (int i = 0; i < line_num; i++)
            data[i] = file_read.nextLine();

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

    static String[] Alphabetize() throws IOException {
        // Organize String array alphabetically
        String[] data = Read_File();
        Arrays.sort(data);

        return data;
    }

    static String[] Write_File() throws IOException {
        // Create an output file
        String[] data = Alphabetize();
        int line_num = Lines_in_Input();

        FileWriter output = new FileWriter("exercise41_output.txt");

        // Write String array data onto output file
        output.write("Total of " + line_num + " names\n-----------------\n");

        for (int i = 0; i < line_num; i++)
        output.write(data[i] + "\n");

        // Close output file
        output.close();

        return data;
    }

    public static void main(String[] args) throws IOException {
        Write_File();
    }
}