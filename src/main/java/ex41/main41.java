package ex41;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class main41 {
    static String[] Read_File() throws IOException {
        // Create an input file
        File text = new File("exercise41_input.txt");
        Scanner file_read = new Scanner(text);

        // Get number of lines in file
        int line_num = 0;
        LineNumberReader line_r = new LineNumberReader(new FileReader(text));
        while (line_r.readLine() != null)
            line_num = line_r.getLineNumber();

        // Read the file and save to String array
        String[] data = new String[line_num];
        for (int i = 0; i < line_num; i++)
            data[i] = file_read.nextLine();

        return data;
    }

    static void Alphabetize() throws IOException {
        String[] data = Read_File();
        System.out.println(data[4]);



    }

    static void Write_File() {
    }

    public static void main(String[] args) throws IOException {
        Alphabetize();
        Write_File();
    }
}

// Organize String array alphabetically
// Create an output file
// Write String array data onto output file