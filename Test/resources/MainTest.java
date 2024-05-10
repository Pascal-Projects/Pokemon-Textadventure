import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final InputStream systemIn = System.in;

    @BeforeEach
    void setUp() {
        System.setIn(systemIn);
    }

    @Test
    @DisplayName("Should initialize player with valid input")
    void shouldInitializePlayerWithValidInput() {

        String input = String.format("John%s10%s10%squit", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[]{}));
        assertNotNull(Main.getPlayer());
        assertEquals("John", Main.getPlayer().getName());
    }

    @Test
    @DisplayName("Should exit with quit command")
    void shouldExitWithQuitCommand() {
        //String input = "John\n10\n10\nquit\n";
        String input = String.format("John%s10%s10%squit", System.lineSeparator(), System.lineSeparator(), System.lineSeparator());
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}