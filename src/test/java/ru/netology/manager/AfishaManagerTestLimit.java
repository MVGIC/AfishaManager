package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTestLimit {
    private AfishaManager manager = new AfishaManager();
    private Afisha first = new Afisha(1, "Bloodshot");
    private Afisha second = new Afisha(2, "Move_on");
    private Afisha third = new Afisha(3, "Hotel_Belgrad");
    private Afisha fourth = new Afisha(4, "Gentlemen");
    private Afisha fifth = new Afisha(5, "Invisible_Man");
    private Afisha sixth = new Afisha(6, "Trolls.World_Tour");
    private Afisha seventh = new Afisha(7, "Number_one");
    private Afisha eighth = new Afisha(8, "Leon");
    private Afisha ninth = new Afisha(9, "The_Mask");
    private Afisha tenth = new Afisha(10, "Inseption");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

//    @Test
//    public void shouldAdd() {
//        manager.add(tenth);
//
//        Afisha[] actual = manager.getAll();
//        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//
//        assertArrayEquals(expected, actual);
//    }

    @Test
    public void shouldShowLimit() {
        manager.getAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    public class AfishaManagerTestOverLimit {
        private AfishaManager manager = new AfishaManager();
        private Afisha first = new Afisha(1, "Bloodshot");
        private Afisha second = new Afisha(2, "Move_on");
        private Afisha third = new Afisha(3, "Hotel_Belgrad");
        private Afisha fourth = new Afisha(4, "Gentlemen");
        private Afisha fifth = new Afisha(5, "Invisible_Man");
        private Afisha sixth = new Afisha(6, "Trolls.World_Tour");
        private Afisha seventh = new Afisha(7, "Number_one");
        private Afisha eighth = new Afisha(8, "Leon");
        private Afisha ninth = new Afisha(9, "The_Mask");
        private Afisha tenth = new Afisha(10, "Inseption");
        private Afisha eleventh = new Afisha(11, "Titanic");
        private Afisha twelfth = new Afisha(12, "Agent_007");
        private Afisha thirteenth = new Afisha(13, "Avengers");
        private Afisha fourteenth = new Afisha(14, "What_men_are_talking_about");
        private Afisha fifteenth = new Afisha(15, "Pirates_of_the_Caribbean");

        @BeforeEach
        public void setUp() {
            manager.add(first);
            manager.add(second);
            manager.add(third);
            manager.add(fourth);
            manager.add(fifth);
            manager.add(sixth);
            manager.add(seventh);
            manager.add(eighth);
            manager.add(ninth);
            manager.add(tenth);
            manager.add(eleventh);
            manager.add(twelfth);
            manager.add(thirteenth);
            manager.add(fourteenth);
            manager.add(fifteenth);
        }

        @Test
        public void shouldShowOverLimit() {
            manager.getAll();

            Afisha[] actual = manager.getAll();
            Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

            assertArrayEquals(expected, actual);
        }

        public class AfishaManagerTestUnderLimit {
            private AfishaManager manager = new AfishaManager();
            private Afisha first = new Afisha(1, "Bloodshot");
            private Afisha second = new Afisha(2, "Move_on");
            private Afisha third = new Afisha(3, "Hotel_Belgrad");
            private Afisha fourth = new Afisha(4, "Gentlemen");
            private Afisha fifth = new Afisha(5, "Invisible_Man");

            @BeforeEach
            public void setUp() {
                manager.add(first);
                manager.add(second);
                manager.add(third);
                manager.add(fourth);
                manager.add(fifth);
            }

            @Test
            public void shouldShowUnderLimit() {
                manager.getAll();

                Afisha[] actual = manager.getAll();
                Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};

                assertArrayEquals(expected, actual);
            }
        }
    }
}