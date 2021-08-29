package dev.patika.third.dao;

import dev.patika.third.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDAO extends CrudRepository<Course,Integer>{

}
