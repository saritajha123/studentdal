package com.sarita.student.dal.Repository;

import org.springframework.data.repository.CrudRepository;

import com.sarita.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
