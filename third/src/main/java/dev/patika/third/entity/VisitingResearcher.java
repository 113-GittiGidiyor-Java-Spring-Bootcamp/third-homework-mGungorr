package dev.patika.third.entity;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class VisitingResearcher extends Instructor{
    private double hourlySalary;
}
