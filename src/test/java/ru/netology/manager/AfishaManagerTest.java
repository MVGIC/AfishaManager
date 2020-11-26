package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {

    @Test
    public void shouldShowOverLimit() {
        AfishaManager manager = new AfishaManager();
        Afisha first = new Afisha(1, "Bloodshot");
        Afisha second = new Afisha(2, "Move_on");
        Afisha third = new Afisha(3, "Hotel_Belgrad");
        Afisha fourth = new Afisha(4, "Gentlemen");
        Afisha fifth = new Afisha(5, "Invisible_Man");
        Afisha sixth = new Afisha(6, "Trolls.World_Tour");
        Afisha seventh = new Afisha(7, "Number_one");
        Afisha eighth = new Afisha(8, "Leon");
        Afisha ninth = new Afisha(9, "The_Mask");
        Afisha tenth = new Afisha(10, "Inseption");
        Afisha eleventh = new Afisha(11, "Titanic");
        Afisha twelfth = new Afisha(12, "Agent_007");
        Afisha thirteenth = new Afisha(13, "Avengers");
        Afisha fourteenth = new Afisha(14, "What_men_are_talking_about");
        Afisha fifteenth = new Afisha(15, "Pirates_of_the_Caribbean");

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

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
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
        AfishaManager manager = new AfishaManager();
        Afisha first = new Afisha(1, "Bloodshot");
        Afisha second = new Afisha(2, "Move_on");
        Afisha third = new Afisha(3, "Hotel_Belgrad");
        Afisha fourth = new Afisha(4, "Gentlemen");
        Afisha fifth = new Afisha(5, "Invisible_Man");
        Afisha sixth = new Afisha(6, "Trolls.World_Tour");
        Afisha seventh = new Afisha(7, "Number_one");
        Afisha eighth = new Afisha(8, "Leon");
        Afisha ninth = new Afisha(9, "The_Mask");
        Afisha tenth = new Afisha(10, "Inseption");

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

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowUnderLimit() {
        AfishaManager manager = new AfishaManager();
        Afisha first = new Afisha(1, "Bloodshot");
        Afisha second = new Afisha(2, "Move_on");
        Afisha third = new Afisha(3, "Hotel_Belgrad");
        Afisha fourth = new Afisha(4, "Gentlemen");
        Afisha fifth = new Afisha(5, "Invisible_Man");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
