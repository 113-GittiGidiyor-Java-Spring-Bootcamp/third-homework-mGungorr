package dev.patika.third.dao;

import dev.patika.third.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends CrudRepository<Student,Integer> {
}
