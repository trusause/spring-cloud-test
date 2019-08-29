package com.trusause.demo.repository;

import com.trusause.demo.domain.Student;
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
public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {


}
