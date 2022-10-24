package com.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2022-10-06 17:18:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {;
    /**
    * ID
    */
    private Long id;
    
    private String serial;

}