package ex43;

import org.junit.jupiter.api.Test;
import static ex43.main43.user;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Generator_Test {
    @Test
    void is_directory_saving_input_names() throws IOException {
        //given
        user[2] = "n";
        user[3] = "n";

        // when
        String expect = "website index.html";
        String actual = Generator.directory();

        // then
        assertEquals(expect, actual);
    }
}
