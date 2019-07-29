package com.trusause.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trusause.app.domain.Teacher;
import com.trusause.app.mapper.TeacherMapper;
import com.trusause.app.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    TeacherMapper teacherMapper;

    //    @Transactional
    public Teacher findById(Integer id) {
        return teacherRepository.findByIdAndDeleteFlagIsFalse(id);
    }

    public Teacher findByOne(Integer id) {
        return teacherRepository.getOne(id);
    }

    public Teacher sel(int id) {
        return teacherMapper.sel(id);
    }

    public Teacher selectByCode(String code) {
        return teacherMapper.selectByCode(code);
    }

    public List<Teacher> selectByName(String name) {
        PageInfo pageInfo = new PageInfo(teacherMapper.selectByName(name));
        PageHelper.startPage(1, 2);
        PageInfo pageInfo1 = new PageInfo(teacherMapper.selectByName(name));
        return teacherMapper.selectByName(name);
    }
}
