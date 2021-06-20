/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class output_test {
    @Test
    void is_Sorting_Last_Name_Working() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "Ling";
        String actual = data[1][0];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Sorting_First_Name_Working() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "Mai";
        String actual = data[1][1];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Sorting_Salary_Working() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "55900";
        String actual = data[1][2];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Print_Labels_Working() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "Last";
        String actual = data[0][0];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Print_Labels_Working2() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "First";
        String actual = data[0][1];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Print_Labels_Working3() throws IOException {
        // given
        String[][] data = Output.Sorting();

        // when
        String expect = "Salary";
        String actual = data[0][2];

        // then
        assertEquals(expect, actual);
    }
}
