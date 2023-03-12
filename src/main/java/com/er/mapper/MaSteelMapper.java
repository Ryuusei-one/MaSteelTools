package com.er.mapper;

import com.er.model.MaSteelModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface MaSteelMapper {

    List<MaSteelModel> getMsg();
}
