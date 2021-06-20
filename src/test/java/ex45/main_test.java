package ex45;

import ex41.main41;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main_test {
    @Test
    void is_program_replacing_correctly() throws IOException {
        // when
        String expect = main45.replace();
        String actual =  """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".
                """;

        // then
        assertEquals(expect, actual);
    }
    @Test
    void is_Reading_File_and_Getting_Number_of_Lines_Working() throws IOException {
        // given
        main45.Lines_in_Input();

        // when
        int expect = main45.Lines_in_Input();
        int actual = 3;

        // then
        assertEquals(expect, actual);
    }
}