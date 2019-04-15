package com.crao.crud.dao;


import com.crao.crud.dto.Student;
import com.github.pagehelper.Page;

public interface StudentMapper {

    String getTest();

    Page<Student> getStudent(Student student);

    Page<Student> getTestList(Student student);

    void addStudent(Student student);

    void delStudent(Student student);

    void updateStudent(Student student);
}
