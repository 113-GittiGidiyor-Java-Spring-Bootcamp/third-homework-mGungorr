package dev.patika.third;

import dev.patika.third.entity.Gender;
import dev.patika.third.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class ThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdApplication.class, args);
        Student student1 = new Student("Mustafa Güngör", LocalDate.of(1997, Month.MARCH, 18), "Eskişehir", Gender.MALE);
        Student student2 = new Student("Mehmet Doğan", LocalDate.of(1985, Month.APRIL, 11), "Ankara", Gender.MALE);
        Student student3 = new Student("Ayşe Şahin", LocalDate.of(2006, Month.MAY, 20), "İstanbul", Gender.FEMALE);
    }

}
