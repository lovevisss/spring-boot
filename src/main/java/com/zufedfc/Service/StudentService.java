package com.zufedfc.Service;

import com.zufedfc.Dao.StudentDao;
import com.zufedfc.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
}
