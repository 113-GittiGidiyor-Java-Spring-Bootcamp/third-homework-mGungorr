package dev.patika.third.dao;

import dev.patika.third.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDAO extends CrudRepository<Instructor,Integer> {
}
