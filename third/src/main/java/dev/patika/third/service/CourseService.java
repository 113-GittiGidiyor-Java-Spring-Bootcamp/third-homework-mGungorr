package dev.patika.third.service;

import dev.patika.third.dao.CourseDAO;
import dev.patika.third.entity.Course;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements BaseService<Course> {

    private final CourseDAO courseDAO;

    public CourseService(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    @Transactional
    public List<Course> findAll() {
        List<Course> courseList = new ArrayList<>();
        Iterable<Course> courseIter = courseDAO.findAll();
        for (Course course : courseIter) {
            courseList.add(course);
        }
        return courseList;
    }

    @Override
    @Transactional
    public Course findById(int id) {
        return courseDAO.findById(id).get();
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Course update(Course course) {
        return courseDAO.save(course);
    }
}
