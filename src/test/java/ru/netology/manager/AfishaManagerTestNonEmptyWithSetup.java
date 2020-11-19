package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmsInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTestNonEmptyWithSetup {
    private AfishaManager manager = new AfishaManager();
    private FilmsInfo first = new FilmsInfo(1, "Bloodshot");
    private FilmsInfo second = new FilmsInfo(2, "Move_on");
    private FilmsInfo third = new FilmsInfo(3, "Hotel_Belgrad");
    private FilmsInfo fourth = new FilmsInfo(4, "Gentlemen");
    private FilmsInfo fifth = new FilmsInfo(5, "Invisible_Man");
    private FilmsInfo sixth = new FilmsInfo(6, "Trolls.World_Tour");
    private FilmsInfo seventh = new FilmsInfo(7, "Number_one");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldAdd() {
        manager.add(fourth);

        FilmsInfo[] actual = manager.getAll();
        FilmsInfo[] expected = new FilmsInfo[]{fourth, third, second, first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
}