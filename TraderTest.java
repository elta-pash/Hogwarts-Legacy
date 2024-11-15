package a52112401;

import a52112401.Tradeable;
import a52112401.Trader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {
    static class TraderTestClass implements Trader {

        @Override
        public boolean possesses(Tradeable item) {
            return false;
        }

        @Override
        public boolean canAfford(int amount) {
            return false;
        }

        @Override
        public boolean hasCapacity(int weight) {
            return false;
        }

        @Override
        public boolean pay(int amount) {
            return false;
        }

        @Override
        public boolean earn(int amount) {
            return false;
        }

        @Override
        public boolean addToInventory(Tradeable item) {
            return false;
        }

        @Override
        public boolean removeFromInventory(Tradeable item) {
            return false;
        }

        @Override
        public boolean steal(Trader thief) {
            return false;
        }

        @Override
        public boolean loot(Trader looter) {
            return false;
        }
    }
    static TraderTestClass tester = new TraderTestClass();

    @Test
    void canSteal() {
        Assertions.assertFalse(tester.canSteal());
    }

    @Test
    void isLootable() {
        Assertions.assertFalse(tester.isLootable());
    }

    @Test
    void canLoot() {
        Assertions.assertFalse(tester.canLoot());
    }
}