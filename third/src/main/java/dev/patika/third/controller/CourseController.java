package dev.patika.third.controller;

import dev.patika.third.entity.Course;
import dev.patika.third.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> findAll() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/courses")
    public Course saveCourse(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> findCourseById(@PathVariable int id){
        return new ResponseEntity<>(courseService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.update(course);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable int id){
        courseService.deleteById(id);
        return "Deleted...";
    }

//    @GetMapping("/getNumberOfCourses")
//    public String getNumberOfCourses(){
//        int empNumber = courseService.getNumberOfCourses();
//        return "Total course number on DB : " + empNumber ;
//    }

//
//    @GetMapping("/getAgesWithGrouping")
//    public List<?> getAgesWithGrouping(){
//        return courseService.getAgesWithGrouping();
//    }
//
//    @GetMapping("/getAgesWithGroupingWithNativeQuery")
//    public List<?> getAgesWithGroupingWithNativeQuery(){
//        return courseService.getAgesWithGroupingWithNativeQuery();
//    }
//
//    @GetMapping("/findByName/{name}")
//    public List<Course> getCoursesWithName(@PathVariable String name){
//        return courseService.getCoursesWithName(name);
//    }
//
//    @GetMapping("/findByNameContaining/{name}")
//    public List<Course> getCoursesWithNameContaining(@PathVariable String name){
//        return courseService.getCoursesWithNameContaining(name);
//    }
//
//    @GetMapping("/findByAgeGreaterThan/{age}")
//    public List<Course> findByAgeGreaterThan(@PathVariable int age){
//        return courseService.findByAgeGreaterThan(age);
//    }
//
//    @GetMapping("/findByAgeGreaterThanAndSalaryBefore/{age}/{salary}")
//    public List<Course> findByAgeGreaterThanAndSalaryBefore(@PathVariable int age, @PathVariable double salary){
//        return courseService.findByAgeGreaterThanAndSalaryBefore(age, salary);
//    }
//
//    @GetMapping("/findFirst3BySalaryGreaterThan/{salary}")
//    public List<Course> findFirst3BySalaryGreaterThan(@PathVariable double salary){
//        return courseService.findFirst3BySalaryGreaterThan(salary);
//    }
//
//    @GetMapping("/deleteByFullName/{name}")
//    public String findFirst3BySalaryGreaterThan(@PathVariable String name){
//        courseService.deleteByFullName(name);
//        return "Deleted...";
//    }

}
