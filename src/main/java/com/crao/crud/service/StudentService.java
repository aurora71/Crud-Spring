package com.crao.crud.service;

import com.crao.crud.dao.StudentMapper;
import com.crao.crud.dto.StudentDTO;
import com.crao.crud.pojo.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;
    /**
     *
     * @return
     */
    public String getTest(Student student){
        return studentMapper.getTest();
    }

    public Page<Student> getStudent(long id){
        return studentMapper.getStudent(id);
    }

    public Page<Student> getTestList(StudentDTO student){
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

    public Page<Student> getDelStudent() {
        return studentMapper.getDelStudent();
    }

    public Page<Student> queryPageStudent(StudentDTO student) {
        PageHelper.startPage(student.getPageNum(),student.getPageSize());
        PageHelper.orderBy(student.getOrderBy());
        return studentMapper.getTestList(student);
    }
}
