/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex44;

import ex43.Generator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static ex44.Product.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_User_Input_Printing_Input_From_File() throws IOException {
        // given
        Product.File_Parser();

        System.out.print("What is the product name? ");
        String user = "Thing";
        for (int i = 0; i < 3; i++) {
            if (user.equals(name.get(i))) {
                System.out.printf("Name: %s \nPrice: %.2f \nQuantity: %d",
                        name.get(i), price.get(i), quantity.get(i));
            }
        }

        // when
        String expect = """
                Name: Thing
                Price: 15.0
                Quantity: 5""";
        String actual = "Name: " + name.get(1) + "\nPrice: " + price.get(1) + "\nQuantity: " + quantity.get(1);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Input_from_JSONG_Saving_Correctly() throws IOException {
        //given
        Product.File_Parser();

        // when
        String expect = "Widget";
        String actual = name.get(0);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Input_from_JSONG_Saving_Correctly2() throws IOException {
        //given
        Product.File_Parser();

        // when
        double expect = 25.00;
        double actual = price.get(0);

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Input_from_JSONG_Saving_Correctly3() throws IOException {
        //given
        Product.File_Parser();

        // when
        int expect = 5;
        int actual = quantity.get(0);

        // then
        assertEquals(expect, actual);
    }
}
