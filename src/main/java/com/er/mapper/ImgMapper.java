package com.er.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.er.model.ImgModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/5/17 10:25
 */
@Mapper
@Repository
public interface ImgMapper extends BaseMapper<ImgModel> {
    List<ImgModel> selectImgUrl(String state);
    int state4state(String state);
}
