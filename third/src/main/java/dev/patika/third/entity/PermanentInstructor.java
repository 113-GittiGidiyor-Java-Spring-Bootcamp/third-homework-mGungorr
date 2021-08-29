package dev.patika.third.entity;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class PermanentInstructor extends Instructor{
    private double fixedSalary;
}
