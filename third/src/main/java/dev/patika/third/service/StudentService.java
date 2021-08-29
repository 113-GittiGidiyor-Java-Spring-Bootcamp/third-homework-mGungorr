package dev.patika.third.service;

import dev.patika.third.dao.StudentDAO;
import dev.patika.third.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements BaseService<Student>{

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Iterable<Student> studentIter = studentDAO.findAll();
        for (Student student : studentIter) {
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return studentDAO.findById(id).get();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Student update(Student student) {
        return studentDAO.save(student);
    }
}
