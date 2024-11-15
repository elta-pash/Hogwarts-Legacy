package a52112401;

import a52112401.MagicLevel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicLevelTest {

    @Test
    void testToString() {
        Assertions.assertEquals("*", MagicLevel.NOOB.toString());
        Assertions.assertEquals("**", MagicLevel.ADEPT.toString());
        Assertions.assertEquals("***", MagicLevel.STUDENT.toString());
        Assertions.assertEquals("****", MagicLevel.EXPERT.toString());
        Assertions.assertEquals("*****", MagicLevel.MASTER.toString());
    }

    @Test
    void toMana() {
        Assertions.assertEquals(50, MagicLevel.NOOB.toMana());
        Assertions.assertEquals(100, MagicLevel.ADEPT.toMana());
        Assertions.assertEquals(200, MagicLevel.STUDENT.toMana());
        Assertions.assertEquals(500, MagicLevel.EXPERT.toMana());
        Assertions.assertEquals(1000, MagicLevel.MASTER.toMana());
    }
}