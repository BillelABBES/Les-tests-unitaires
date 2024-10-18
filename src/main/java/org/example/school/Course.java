package org.example.school;

public class Course {
    private String name;
    private String description;
    private int duration;

    public Course(String name, String description, int duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void updateName(String newName){
        this.name = newName;
    }

    public void updateDescription (String newDescription){
        this.description = newDescription;
    }

    public int getDuration(){
        return duration;
    }

    public boolean isOneDayCourse(){
        return duration == 1 ;
    }

}
