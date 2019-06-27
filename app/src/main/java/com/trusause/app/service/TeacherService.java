package com.trusause.app.service;

import com.trusause.app.domain.Teacher;
import com.trusause.app.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: weicl
 * @Date: 2019/6/25 9:16 AM
 * @Version 1.0
 * @Description ${description}
 */
@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    //    @Transactional
    public Teacher findById(Integer id) {
        return teacherRepository.findByIdAndDeleteFlagIsFalse(id);
    }

    public Teacher findByOne(Integer id) {
        return teacherRepository.getOne(id);
    }

}
