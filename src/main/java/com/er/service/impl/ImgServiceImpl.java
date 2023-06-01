package com.er.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.er.mapper.ImgMapper;
import com.er.model.ImgModel;
import com.er.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/5/17 10:22
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ImgServiceImpl extends ServiceImpl<ImgMapper, ImgModel> implements ImgService {
    @Autowired
    private ImgMapper imgMapper;

    @Override
    public List<ImgModel> selectImgUrl(String state){
        return imgMapper.selectImgUrl(state);
    }

    @Override
    public int state4state(String state) {
        return imgMapper.state4state(state);
    }

}
