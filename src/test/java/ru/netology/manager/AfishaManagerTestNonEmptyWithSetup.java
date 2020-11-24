package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTestNonEmptyWithSetup {
    private AfishaManager manager = new AfishaManager(5);
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
    }

    @Test
    public void shouldAdd() {
        manager.add(tenth);

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLimit() {
//        manager.add(tenth);
        manager.getAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}