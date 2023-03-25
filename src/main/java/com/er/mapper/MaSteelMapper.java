package com.er.mapper;

import com.er.model.MaSteelModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author Ryuusei
 */
@Mapper
@Repository
public interface MaSteelMapper {

    List<MaSteelModel> getMsg(MaSteelModel maSteelModel);
}
