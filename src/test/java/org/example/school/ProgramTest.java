package org.example.school;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {

    static Program program;
    @BeforeAll
    public static void initProgram (){
        program = new Program();
        Course java = new Course("java", "cours de java", 2);
        Course c = new Course("c", "cours de langage c", 3);
        Course go = new Course("go", "cours de langage go", 2);
        program.getCourses().add(java);
        program.getCourses().add(c);
        program.getCourses().add(go);
    }

    @Test
    public void testIsCourseExist(){

        boolean result = program.isCourseExist("java");
        assertTrue(result);

        result = program.isCourseExist("go");
        assertTrue(result);

        result = program.isCourseExist("c++");
        assertFalse(result);

    }

    @Test
    public void testNbCourse(){
        int result = program.nbCourse();
        assertEquals(3, result);
    }
}
