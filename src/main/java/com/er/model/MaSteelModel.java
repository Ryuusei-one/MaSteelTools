package com.er.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * @author Ryuusei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaSteelModel {
    private Integer id ;
    private String billetNum;
    private Date createTime;
    private String billetPicPath;

//    /** pageNum 页数 */
//    private int pageNum;
//    /** pageSize 一页的行数 */
//    private int pageSize;
}
