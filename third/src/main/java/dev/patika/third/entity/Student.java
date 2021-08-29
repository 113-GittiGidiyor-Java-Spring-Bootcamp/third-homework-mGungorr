package dev.patika.third.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String studentName;
    private LocalDate studentBirthDate;
    private String studentAdress;
    private Gender gender;

    @ManyToMany(mappedBy = "students")
    private List<Course> studentCourses = new ArrayList<>();

    public Student(String mehmet_doğan, LocalDate of, String ankara, Gender male) {

    }
}
