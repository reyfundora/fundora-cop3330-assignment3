/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex43;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ex43.main43.user;

public class main_test {
    @Test
    void is_User_Input_Turning_Into_Lower_Case() {
        // given
        user[2] = "Y";
        user[2] = user[2].toLowerCase();

        // when
        String expect = "y";
        String actual = user[2];

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_User_Input_Turning_Into_Lower_Case2() {
        // given
        user[2] = "N";
        user[2] = user[2].toLowerCase();

        // when
        String expect = "n";
        String actual = user[2];

        // then
        assertEquals(expect, actual);
    }
}
