package com.er.service.impl;

import ch.qos.logback.core.pattern.color.MagentaCompositeConverter;
import com.er.mapper.MaSteelMapper;
import com.er.model.MaSteelModel;
import com.er.service.MaSteelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ryuusei
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class MaSteelServiceImpl implements MaSteelService {
    @Autowired
    private MaSteelMapper maSteelMapper;
    @Override
    public List<MaSteelModel> getMsg(MaSteelModel maSteelModel) {
        return maSteelMapper.getMsg(maSteelModel);
    }
}
