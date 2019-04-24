package com.crao.crud.controller;

import com.crao.crud.dto.StudentDTO;
import com.crao.crud.pojo.Student;
import com.crao.crud.service.RedisService;
import com.crao.crud.service.StudentService;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentService studentService;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        String test = studentService.getTest(null);
        System.out.println(test);
        return test;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Page<Student> testList(StudentDTO student){
        Page<Student> test = studentService.getTestList(student);
        System.out.println(test);
        return test;
    }


    @RequestMapping(value = "/getStudentByID", method = RequestMethod.GET)
    public Page<Student> getStudent(Student dto){
        Page<Student> test=studentService.getStudent(dto.getId());
        return test;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public void addStudent(Student student){
        studentService.addStudent(student);
        return;
    }

    @RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
    public void delStudent(Student student){
        studentService.delStudent(student);
        return;
    }

    @RequestMapping(value = "/updateStudent", method = RequestMethod.GET)
    public void updateStudent(Student student){
        studentService.updateStudent(student);
        return;
    }

    @RequestMapping(value = "/getDelStudent", method = RequestMethod.GET)
    public Page<Student> getDelStudent(Student student) {
        Page<Student> test = studentService.getDelStudent();
        return test;
    }

    @GetMapping("/userPage")
    public Page<Student> queryPageStudent(StudentDTO student) {
        Page<Student> test = studentService.queryPageStudent(student);
        return test;
    }
}
