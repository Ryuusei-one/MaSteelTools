package com.er.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaSteelModel {
    private Integer id ;
    private String billetNum;
    private Date createTime;
    private String billetPicPath;
<<<<<<< HEAD
    private String warpagePicPath;
=======
>>>>>>> 0a7e5dc (修改表示层,提交vue.)
}
