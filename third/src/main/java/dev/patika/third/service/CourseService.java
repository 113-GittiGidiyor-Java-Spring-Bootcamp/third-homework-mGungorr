package dev.patika.third.service;

import dev.patika.third.dao.BaseDAO;
import dev.patika.third.entity.Course;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements BaseService<Course> {

    private final BaseDAO baseDAO;

    public CourseService(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

    @Override
    @Transactional
    public List<Course> findAll() {
        List<Course> courseList = new ArrayList<>();
        Iterable<Course> courseIter = baseDAO.findAll();
        for (Course course : courseIter) {
            courseList.add(course);
        }
        return courseList;
    }

    @Override
    @Transactional
    public Course findById(int id) {
        return baseDAO.findById(id).get();
    }

    @Override
    public Course save(Course course) {
        return baseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        baseDAO.deleteById(id);
    }

    @Override
    public Course update(Course course) {
        return null;
    }
}
