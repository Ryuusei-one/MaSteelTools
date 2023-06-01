package com.er.service;


import com.er.model.MaSteelModel;

import java.util.List;

/**
 * @author Ryuusei
 */
public interface MaSteelService {
    List<MaSteelModel> getMsg(MaSteelModel maSteelModel);
//    int updateByIds(List<Long> ids, Integer state);
    int updateById(MaSteelModel maSteelModel);
    List<MaSteelModel> getMsgByState(MaSteelModel maSteelModel);
    List<MaSteelModel> selectBilletInfoList(MaSteelModel maSteelModel);
}
