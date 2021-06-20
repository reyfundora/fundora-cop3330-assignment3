/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex42;

import ex41.main41;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_Reading_the_File_Working() throws IOException {
        // given
        String[] data = main42.Read_File();

        // when
        String expect = "Ling,Mai,55900";
        String actual = data[0];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Reading_the_File_Working2() throws IOException {
        // given
        String[] data = main42.Read_File();

        // when
        String expect = "Zarnecki,Sabrina,51500";
        String actual = data[6];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Number_of_Lines_Working() throws IOException {
        // given
        main42.Lines_in_Input();

        // when
        int expect = main42.Lines_in_Input();
        int actual = 7;

        // then
        assertEquals(expect, actual);
    }
}
