package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Afisha;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;

    @Test
    public void shouldShowOverLimit() {
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

        Afisha[] returned = new Afisha[]{sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth};
        doReturn(returned).when(repository).findAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldAdd() {
        Afisha first = new Afisha(1, "Bloodshot");

        manager.add(first);

        Afisha[] returned = new Afisha[]{first};
        doReturn(returned).when(repository).findAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{first};
        assertArrayEquals(expected, actual);

        verify(repository).save(first);
    }

    @Test
    public void shouldShowLimit() {
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

        Afisha[] returned = new Afisha[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        doReturn(returned).when(repository).findAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldShowUnderLimit() {
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

        Afisha[] returned = new Afisha[]{first, second, third, fourth, fifth};
        doReturn(returned).when(repository).findAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldRemoveIfExist() {
        Afisha first = new Afisha(1, "Bloodshot");
        Afisha second = new Afisha(2, "Move_on");
        Afisha third = new Afisha(3, "Hotel_Belgrad");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        int idToRemove = 1;

        Afisha[] returned = new Afisha[]{second, third};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{third, second};
        assertArrayEquals(expected, actual);

        verify(repository).removeById(idToRemove);
    }

    @Test
    public void shouldNotRemoveIfNotExist() {
        Afisha first = new Afisha(1, "Bloodshot");
        Afisha second = new Afisha(2, "Move_on");
        Afisha third = new Afisha(3, "Hotel_Belgrad");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        int idToRemove = 4;

        Afisha[] returned = new Afisha[]{first, second, third};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{third, second, first};
        assertArrayEquals(expected, actual);

        verify(repository).removeById(idToRemove);
    }

//    @Test
//    public void shouldFindById() {
//        Afisha first = new Afisha(1, "Bloodshot");
//        Afisha second = new Afisha(2, "Move_on");
//        Afisha third = new Afisha(3, "Hotel_Belgrad");
//
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//
//        int idToFind = 2;
//
//        Afisha[] returned = new Afisha[]{second};
//        doReturn(returned).when(repository).findAll();
//
//        repository.findById(2);
//        Afisha[] actual = manager.getAll();
//        Afisha[] expected = new Afisha[]{second};
//        assertArrayEquals(expected, actual);
//
//       verify(repository).findById(idToFind);
//    }
}