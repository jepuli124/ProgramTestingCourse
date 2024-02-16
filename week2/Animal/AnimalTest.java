import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    // Write your tests here.

    @Test
    public void testAnimalGetAge(){


        int expected = 5;
        Animal animal = new Animal(null, expected);
        int actual = animal.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testAnimalGetName(){

        String expected = "name";
        Animal animal = new Animal(expected, 0);
        String actual = animal.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testAnimalShout(){

        String expected = "<default shout>";
        Animal animal = new Animal("kello", 2);
        String actual = animal.shout();

        assertEquals(expected, actual);
    }

    @Test
    public void testAnimalInvalidAge(){

        int expected = -1;
        Animal animal = new Animal("kello", expected);
        int actual = animal.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testAnimalInvalidName(){

        String expected = "undefined";
        Animal animal = new Animal(null, 2);
        String actual = animal.getName();

        assertEquals(expected, actual);
    }

}
