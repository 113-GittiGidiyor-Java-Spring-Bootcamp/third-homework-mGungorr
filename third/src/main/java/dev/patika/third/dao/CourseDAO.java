package dev.patika.third.dao;

import dev.patika.third.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDAO extends CrudRepository<Course,Integer>{
//    List<Course> findByFullName(String s);
//    List<Course> findByFullNameContaining(String s);
//    List<Course> findByAgeGreaterThan(int age);
//    List<Course> findByAgeGreaterThanAndSalaryBefore(int age, double salary);
//    List<Course> findFirst3BySalaryGreaterThan(double salary);
//
//    void deleteByFullName(String name);
//
//    @Query("select count(e) from Course e")
//    int getNumberOfEmployees();

//    @Query("select e.age, count(e.age) from Course e GROUP BY e.age")
//    List<?> getAgesWithGrouping();

//    @Query(nativeQuery = true, value = "select age AS age, count(age) AS count from employee e GROUP BY age")
//    List<EmployeeAgeStatistics> getAgesWithGroupingWithNativeQuery();
}
