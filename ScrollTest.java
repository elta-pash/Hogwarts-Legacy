package a52112401;

import a52112401.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ScrollTest {
    static AttackingSpell fireball = new AttackingSpell("Fire Ball", 3, MagicLevel.STUDENT, true, false, 3);
    static Scroll S;

    @BeforeEach
    void setUp() {
        S = new Scroll("Scroll", 1, 1, 1, fireball);
    }

    @Test
    void constructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {Scroll tmp = new Scroll("a", 3, 1, 1, null);});
        Assertions.assertDoesNotThrow(() -> {Scroll tmp = new Scroll("a", 3, 1, 1, fireball);});
    }

    @Test
    void additionalOutputString() {
        Assertions.assertEquals("; casts " + fireball.toString(), S.additionalOutputString());
    }

    @Test
    void useOn() {
        Wizard dude = new Wizard("Dude", MagicLevel.NOOB, 10, 3, 50, 0,
                999, new HashSet<>(), new HashSet<>(), 999, new HashSet<>());
        S.useOn(dude);
        Assertions.assertTrue(dude.isDead());
    }
}