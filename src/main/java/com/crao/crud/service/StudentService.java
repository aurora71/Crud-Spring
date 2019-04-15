package com.crao.crud.service;

import com.crao.crud.dao.StudentMapper;
import com.crao.crud.dto.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;
    /**
     *
     * @return
     */
    public String getTest(Student student){
        return studentMapper.getTest();
    }

    public Page<Student> getStudent(Student student){
        return studentMapper.getStudent(student);
    }

    public Page<Student> getTestList(Student student){
        PageHelper.orderBy(student.getOrderBy());
        System.out.println(student.getOrderBy());
        return studentMapper.getTestList(student);
    }

    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    public void delStudent(Student student) {
        studentMapper.delStudent(student);
    }

    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }
}
