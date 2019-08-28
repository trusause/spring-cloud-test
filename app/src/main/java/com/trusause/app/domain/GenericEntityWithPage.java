package com.trusause.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.sql.Timestamp;

/**
 * 通用表
 *
 * @author weicl
 * @version 1.0
 * @date 2018/04/19
 * @since JDK 1.8
 */

@Getter
@Setter
@MappedSuperclass
public abstract class GenericEntityWithPage {
    @Builder.Default
    @Column(updatable = false, columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间的时间戳'")
    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp systemCreateTime;     //创建时间

    /**
     * 修改时间
     */
    @Builder.Default
    @Column(columnDefinition = "timestamp ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间的时间戳'")
    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp systemUpdateTime;

    /**
     * 创建人账号
     */
    @Column(length = 20)
    private String createPerson;

    /**
     * 创建人姓名
     */
    @Column(length = 20)
    private String createPersonName;

    /**
     * 修改人账号
     */
    @Column(length = 20)
    private String updatePerson;

    /**
     * 修改人姓名
     */
    @Column(length = 20)
    private String updatePersonName;

    /**
     * 是否删除标记（0：未删除；1：删除。因为要推送到各个系统，所以所有需要推送的数据表数据都不能物理删除，只能逻辑软删除）
     */
    @Column(columnDefinition = "boolean DEFAULT false COMMENT '是否删除标记'")
    @Builder.Default
    private Boolean deleteFlag = Boolean.FALSE;

    /**
     * 当前页码
     */
    @Transient
    private Integer pageNum = 1;

    /**
     * 显示数据条数
     */
    @Transient
    private Integer pageSize = 10;

    /**
     * 总页码
     */
    @Transient
    private Integer pages;

    /**
     * 数据总条数
     */
    @Transient
    private Integer count;

}
