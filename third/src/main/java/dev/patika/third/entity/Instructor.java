package dev.patika.third.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String instructorName;
    private String instructorAdress;
    private long instructorPhone;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courseList = new ArrayList<>();
}
