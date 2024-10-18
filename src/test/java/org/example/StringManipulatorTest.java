package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    StringManipulator stringManipulator = new StringManipulator();

    @Test
    public void testReverseString(){
        List<String> initialValues = List.of(
                "Hello", "word", "", "12", "H"
        );
        List<String> exceptedValues = List.of(
                "olleH", "drow", "", "21", "H"
        );
        String result;
        for (int i = 0; i < initialValues.size(); i++ ){
            result = stringManipulator.revereString(initialValues.get(i));
            assertEquals(exceptedValues.get(i), result);
        }
    }
}
