package com.zufedfc.Entity;

public class Student {
//    id int(11) NOT NULL AUTO_INCREMENT,
//    name varchar(255) DEFAULT NULL,
//    course varchar(255) DEFAULT NULL,
    private int id;
    private String name;
    private String course;

    public Student() {
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

//    get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    get set

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
