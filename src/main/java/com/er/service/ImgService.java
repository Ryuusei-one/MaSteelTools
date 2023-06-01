package com.er.service;

import com.baomidou.mybatisplus.service.IService;
import com.er.model.ImgModel;

import java.util.List;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/5/17 10:16
 */
public interface ImgService extends IService<ImgModel> {
    List<ImgModel> selectImgUrl(String state);
    int state4state(String state);
}
