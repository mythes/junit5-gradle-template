import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicTest {
    @Test
    void firstTest() {
        assertAll(
                () -> assertEquals(1, 1),
                () -> assertEquals("s", "s")
        );
    }
}
