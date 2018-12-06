import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BasicTest {
    @Tag("localhost")
    @Test
    void firstTest() {
        assertAll(
                () -> assertEquals(1, 1),
                () -> assertEquals("s", "s")
        );
    }
}
