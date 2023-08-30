package com.zufedfc.Dao;

import com.zufedfc.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {
// use map to store student info
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Alex U", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }

//    get all student
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

}

