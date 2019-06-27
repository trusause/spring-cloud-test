package com.trusause.app.repository;

import com.trusause.app.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author: weicl
 * @Date: 2019/6/24 5:32 PM
 * @Version 1.0
 * @Description ${description}
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>, JpaSpecificationExecutor<Teacher> {

    Teacher findByIdAndDeleteFlagIsFalse(Integer id);

}
