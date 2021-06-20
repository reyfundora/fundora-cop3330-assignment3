package ex46;

import ex45.main45;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ex46.main46.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_file_reader_getting_every_word_from_file() throws IOException {
        // given
        List<String> words = Sort();

        // when
       int expect = 10;
        int actual = words.size();

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_file_getting_correct_words() throws IOException {
        // given
        List<String> words = Sort();

        // when
        String expect = "mushroom";
        String actual = words.get(4);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_file_getting_correct_words2() throws IOException {
        // given
        List<String> words = Sort();

        // when
        String expect = "snake";
        String actual = words.get(6);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_file_getting_correct_words3() throws IOException {
        // given
        List<String> words = Sort();

        // when
        String expect = "badger";
        String actual = words.get(9);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_2D_Array_Sorting_Symbols_Correctly() throws IOException {
        // given
        String[][] words = Count();

        // when
        String expect = "*******";
        String actual = words[0][1];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_2D_Array_Sorting_Symbols_Correctly2() throws IOException {
        // given
        String[][] words = Count();

        // when
        String expect = "**";
        String actual = words[1][1];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_2D_Array_Sorting_Symbols_Correctly3() throws IOException {
        // given
        String[][] words = Count();

        // when
        String expect = "*";
        String actual = words[2][1];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_2D_Array_Sorted_Most_Stars_to_Least_stars() throws IOException {
        // given
        String[][] words = Big_to_Small();

        // when
        String expect = "badger: ";
        String actual = words[0][0];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_2D_Array_Sorted_Most_Stars_to_Least_stars2() throws IOException {
        // given
        String[][] words = Big_to_Small();

        // when
        String expect = "snake: ";
        String actual = words[2][0];

        // then
        assertEquals(expect, actual);
    }
}
