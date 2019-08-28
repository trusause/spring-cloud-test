package com.trusause.app.dto;

import com.trusause.app.domain.GenericEntity;
import com.trusause.app.domain.GenericEntityWithPage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class TeacherResponseDTO extends GenericEntity {

    /**
     * 主键
     */
    private Integer id;

    private String code;

    private String name;

}