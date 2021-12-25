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
    public void AddDoesNotAcceptNull(){
        Assertions.assertFalse(list.add(null));
        Assertions.assertTrue(list.add("Something"));
        Assertions.assertEquals(1, list.size());
    }
}
