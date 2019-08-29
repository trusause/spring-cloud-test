package com.trusause.app.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 通过mybatis逆向工程生成的文件。
 */
@Table(name = "t_test_course")
public class Course {
    /**
     * JPA提供的四种标准用法为TABLE,SEQUENCE,IDENTITY,AUTO.
     *
     * TABLE：使用一个特定的数据库表格来保存主键。
     * SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     * IDENTITY：主键由数据库自动生成（主要是自动增长型）
     * AUTO：主键由程序控制。
     */
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private String createPerson;

    private String createPersonName;

    private Boolean deleteFlag;

    private Date systemCreateTime;

    private Date systemUpdateTime;

    private String updatePerson;

    private String updatePersonName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public String getCreatePersonName() {
        return createPersonName;
    }

    public void setCreatePersonName(String createPersonName) {
        this.createPersonName = createPersonName == null ? null : createPersonName.trim();
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getSystemCreateTime() {
        return systemCreateTime;
    }

    public void setSystemCreateTime(Date systemCreateTime) {
        this.systemCreateTime = systemCreateTime;
    }

    public Date getSystemUpdateTime() {
        return systemUpdateTime;
    }

    public void setSystemUpdateTime(Date systemUpdateTime) {
        this.systemUpdateTime = systemUpdateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public String getUpdatePersonName() {
        return updatePersonName;
    }

    public void setUpdatePersonName(String updatePersonName) {
        this.updatePersonName = updatePersonName == null ? null : updatePersonName.trim();
    }
}