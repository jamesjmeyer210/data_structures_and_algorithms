import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LinkedListTest {

    private List<String> list;

    @BeforeEach
    public void Before(){
        list = new LinkedList<>();
    }

    @Test
    public void SanityTest(){
        Assertions.assertNotNull(list);
    }

    @Test
    public void AddTest(){
        Assertions.assertFalse(list.add(null));
        Assertions.assertTrue(list.add("Something"));
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void RemoveTest(){
        list.add("hello");
        Assertions.assertTrue(list.remove("hello"));
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void RemoveManyTest(){
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("11");

        Assertions.assertTrue(list.remove("5"));
        Assertions.assertEquals(4, list.size());
    }

    @Test
    public void GetTest(){
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("11");

        Assertions.assertEquals("7", list.get(3));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(-5));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size() + 1));
    }

    @Test
    public void SetTest(){
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("11");

        Assertions.assertEquals("7", list.set(3, "6"));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.set(-5, null));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.set(list.size() + 1, null));
        Assertions.assertThrows(NullPointerException.class, () -> list.set(0, null));
    }

    @Test
    public void AddAtIndexOnEmptyListTest(){
        list.add(0, "1");

        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void AddAtAnyValidIndexTest(){
        list.add(0, "1");
        list.add(0, "2");

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals("1", list.get(1));
        Assertions.assertEquals("2", list.get(0));
    }

    @Test
    public void RemoveAtIndexForOneItemTest(){
        list.add("1");

        Assertions.assertEquals("1", list.remove(0));
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void RemoveAtIndexForManyItemsTest(){
        list.add("0");
        list.add("1");
        list.add("2");

        Assertions.assertEquals("2", list.remove(2));
        Assertions.assertEquals("0", list.remove(0));
        Assertions.assertEquals("1", list.remove(0));
        Assertions.assertEquals(0, list.size());
    }
}
