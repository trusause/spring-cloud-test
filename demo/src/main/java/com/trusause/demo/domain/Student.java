package com.trusause.demo.domain;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

/**
 * @Author: weicl
 * @Date: 2019/6/24 4:02 PM
 * @Version 1.0
 * @Description ${description}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_test_student")
public class Student extends GenericEntity {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    /**
     * 是否删除标记（0：未删除；1：删除。因为要推送到各个系统，所以所有需要推送的数据表数据都不能物理删除，只能逻辑软删除）
     */
    @Column(columnDefinition = "boolean DEFAULT false COMMENT '是否删除标记'")
    @Builder.Default
    private Boolean deleteFlag = Boolean.FALSE;

}