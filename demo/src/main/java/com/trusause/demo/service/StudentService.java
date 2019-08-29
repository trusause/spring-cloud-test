package com.trusause.demo.service;

import com.trusause.demo.domain.Student;
import com.trusause.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: weicl
 * @Date: 2019/6/25 9:16 AM
 * @Version 1.0
 * @Description ${description}
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public void create(Student student){
        studentRepository.save(student);
    }


}
