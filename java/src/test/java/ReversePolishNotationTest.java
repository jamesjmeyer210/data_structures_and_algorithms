import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    private ReversePolishNotation solution;

    @BeforeEach
    void before(){
        solution = new ReversePolishNotation();
    }

    @Test
    void evalTest() {
        Assertions.assertEquals(9
            , solution.eval(new String[]{"2","1","+","3","*"}));

        Assertions.assertEquals(6
            , solution.eval(new String[]{"4","13","5","/","+"}));

        Assertions.assertEquals(22
            , solution.eval(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}