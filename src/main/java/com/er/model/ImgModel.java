package com.er.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/5/17 10:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImgModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id ;
    private String billetPicPath;
    private String state;
}
