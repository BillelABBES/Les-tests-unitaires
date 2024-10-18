package org.example.school;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void testUpdateName(){
        Course course = new Course("java", "ceci c'est cours de java", 5);

        course.updateName("Spring");

        assertEquals("Spring", course.getName());
    }

    @Test
    public void testIsOneDayCourse(){
        Course course = new Course("java", "ceci c'est cours de java", 1);
        boolean result = course.isOneDayCourse();
        assertTrue(result);

        Course otherCourse = new Course("java", "ceci c'est cours de java", 3);
        result = otherCourse.isOneDayCourse();
        assertFalse(result);
    }

}
