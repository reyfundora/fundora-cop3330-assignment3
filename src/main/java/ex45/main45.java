/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex45;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class main45 {

    static String user_input() {
        // Establish user input
        Scanner input = new Scanner(System.in);
        System.out.print("What is the name of the output file? ");

        return input.nextLine();
    }

    static String replace() throws IOException {
        // Create input file
        File input = new File("exercise45_input.txt");
        Scanner file_read = new Scanner(input);

        int line_num = Lines_in_Input();

        // Streamline sentences into one string
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < line_num; i++)
            text.append(file_read.nextLine()).append("\n");

        String text_str = text.toString();
        return text_str.replaceAll("utilize", "use");
    }

    static void output() throws IOException {
        String name = user_input();
        String out = replace();

        // Create an output file
        FileWriter output = new FileWriter(name);

        // Write String to file and close
        output.write(out);
        output.close();
    }

    static int Lines_in_Input() throws IOException {
        // Check number of lines in file
        int line_num = 0;
        LineNumberReader line_r = new LineNumberReader(new FileReader("exercise45_input.txt"));
        while (line_r.readLine() != null)
            line_num = line_r.getLineNumber();

        return line_num;
    }

    public static void main (String[] args) throws IOException {
        output();
    }
}