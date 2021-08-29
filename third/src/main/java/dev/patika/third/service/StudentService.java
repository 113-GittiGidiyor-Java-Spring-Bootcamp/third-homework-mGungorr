package dev.patika.third.service;

import dev.patika.third.dao.BaseDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService{

    private final BaseDAO baseDAO;

    public StudentService(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public Object save(Object object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Object update(Object object) {
        return null;
    }
}
