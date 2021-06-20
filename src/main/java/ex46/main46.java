package ex46;

import java.io.*;
import java.util.*;

public class main46 {
    static List<String> Sort() throws IOException {
        // Create input file
        BufferedReader input = new BufferedReader(new FileReader("exercise46_input.txt"));

        // Create necessary variables for loop.
        List<String> words_in;
        List<String> words = new ArrayList<>();
        String lines;

        // Save words into array.
        while ((lines = input.readLine()) != null) {
            words_in = Arrays.asList(lines.split(" "));

            int size = words_in.size();
            for (int i = 0; i < size; i++)
                words.add(words_in.get(i));
        }

        return words;
    }

    static String[][] Count() throws IOException {
        // Creation of lists and variables for loop
        List<String> words = Sort();
        List<String> unique = new ArrayList<>();

        unique.add(words.get(0));
        int words_count = words.size();
        int unique_count = 0;
        int frequency_count = 0;

        // Statement that filters unique words in the file array
        for (int i = 0; i < words_count; i++) {
            if (!unique.contains(words.get(i))) {
                unique.add(words.get(i));
                unique_count++;
            }
        }

        // Statement that filters frequency of each unique word
        Integer[] frequency = new Integer[unique_count + 1];
        for (int i = 0; i <= unique_count; i++) {
            for (int j = 0; j < words_count; j++) {
                if (unique.get(i).equals(words.get(j)))
                    frequency_count++;
            }

            frequency[i] = 0;
            frequency[i] += frequency_count;
            frequency_count = 0;
        }

        String[][] output = new String[unique_count + 1][2];
        String star = "*";

        for (int i = 0; i <= unique_count; i++)
            output[i][0] = unique.get(i) + ": ";

        for (int i = 0; i <= unique_count; i++) {
            output[i][1] = "";
            for (int j = 0; j < frequency[i]; j++)
                output[i][1] += star;
        }

        return output;
    }

    static String[][] Big_to_Small() throws IOException {
        String[][] output = Count();

        // Use compare function to organize 2D array according to star column
        Arrays.sort(output, new Comparator<String[]>() {
            @Override
            public int compare(String[] t1, String[] t2) {
                String c1 = t1[1];
                String c2 = t2[1];
                return c2.compareTo(c1);
            }
        });

        return output;
    }

    static void Print() throws IOException {
        String[][] output = Big_to_Small();
        int rows_num = output.length;

        for (int i = 0; i < rows_num; i++) {
            System.out.printf("%-11s %-11s\n", output[i][0], output[i][1]);
        }
    }

    public static void main(String[] args) throws IOException {
        Print();
    }
}
