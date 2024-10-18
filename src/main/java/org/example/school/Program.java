package org.example.school;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse (Course course){
        courses.remove(course);
    }

    public int nbCourse (){
        return courses.size();
    }

    public boolean isCourseExist(String name){
        boolean res = false;
        for (Course course : courses){
            if (course.getName().equals(name))
                res = true;
        }
        return res;
    }
}
