/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex41;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;

public class main_test {
    @Test
    void is_Reading_the_File_Working() throws IOException {
        // given
        String[] data = main41.Read_File();

        // when
        String expect = "Ling, Mai";
        String actual = data[0];

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_Reading_the_File_Working2() throws IOException {
        // given
        String[] data = main41.Read_File();

        // when
        String expect = "Xiong, Fong";
        String actual = data[6];

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_Reading_File_and_Getting_Number_of_Lines_Working() throws IOException {
        // given
        main41.Lines_in_Input();

        // when
        int expect = main41.Lines_in_Input();
        int actual = 7;

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_File_Being_Alphabetized() throws IOException {
        // given
        String[] data = main41.Alphabetize();

        // when
        String expect = "Johnson, Jim";
        String actual = data[0];

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_File_Being_Alphabetized2() throws IOException {
        // given
        String[] data = main41.Alphabetize();

        // when
        String expect = "Zarnecki, Sabrina";
        String actual = data[6];

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_Output_the_Same_as_Example() throws IOException {
        // given
        String[] output_array = main41.Write_File();

        // when
        String expect = "Ling, Mai";
        String actual = output_array[3];

        // then
        assertEquals(expect, actual);
    }

    @Test
    void is_Output_the_Same_as_Example2() throws IOException {
        // given
        String[] output_array = main41.Write_File();

        // when
        String expect = "Swift, Geoffrey";
        String actual = output_array[4];

        // then
        assertEquals(expect, actual);
    }
}