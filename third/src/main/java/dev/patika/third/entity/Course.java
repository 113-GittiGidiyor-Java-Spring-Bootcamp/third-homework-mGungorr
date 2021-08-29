package dev.patika.third.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String courseName;
    private int courseCode;
    private int courseCreditPoint;

    @ManyToMany
    private List<Student> students = new ArrayList<>();

    @ManyToOne
    private Instructor instructor;
}
