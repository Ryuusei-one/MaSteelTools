package com.er.mapper;

import com.er.model.MaSteelModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Ryuusei
 */
@Mapper
@Repository
public interface MaSteelMapper {

    List<MaSteelModel> getMsg(MaSteelModel maSteelModel);
//    int updateByIds(@Param(value = "ids")List<Long> ids,@Param(value = "state")Integer state);
    int updateById(MaSteelModel maSteelModel);
    List<MaSteelModel> getMsgByState(MaSteelModel maSteelModel);
    List<MaSteelModel> selectBilletInfoList(MaSteelModel maSteelModel);
}
