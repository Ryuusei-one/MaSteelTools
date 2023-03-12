package com.er.service.impl;

import ch.qos.logback.core.pattern.color.MagentaCompositeConverter;
import com.er.mapper.MaSteelMapper;
import com.er.model.MaSteelModel;
import com.er.service.MaSteelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MaSteelServiceImpl implements MaSteelService {
    @Autowired
    private MaSteelMapper maSteelMapper;
    @Override
    public List<MaSteelModel> getMsg() {
        return maSteelMapper.getMsg();
    }
}
