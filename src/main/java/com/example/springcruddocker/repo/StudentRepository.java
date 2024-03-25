package com.example.springcruddocker.repo;

import com.example.springcruddocker.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
