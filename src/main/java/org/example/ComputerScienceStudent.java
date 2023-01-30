package org.example;

public class ComputerScienceStudent extends Student  {
    private String course;

    public ComputerScienceStudent(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "course='" + course + '\'';
    }

}

